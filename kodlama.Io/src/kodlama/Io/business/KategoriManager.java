package kodlama.Io.business;

import kodlama.Io.core.loging.ILogger;
import kodlama.Io.dataAccess.IKategoriDao;
import kodlama.Io.entities.Kategori;

public class KategoriManager {
	private IKategoriDao kategoriDao;
	private ILogger[] loggers;
	
	public KategoriManager(IKategoriDao kategoriDao, ILogger[] loggers) {
		this.kategoriDao = kategoriDao;
		this.loggers = loggers;
	}

	public void ekle(Kategori kategori) {
		kategoriDao.ekle(kategori);
		
		for (ILogger logger : loggers) {
			logger.log(kategori.getkategoriAd());
		}
	}
}
