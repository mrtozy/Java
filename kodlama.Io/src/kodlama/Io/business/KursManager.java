package kodlama.Io.business;

import kodlama.Io.core.loging.ILogger;
import kodlama.Io.dataAccess.IKursDao;
import kodlama.Io.entities.Kurs;

public class KursManager {
	private IKursDao kursDao;
	private ILogger[] loggers;
	public KursManager(IKursDao kursDao,ILogger[] loggers) {
		this.kursDao = kursDao;
		this.loggers=loggers;
	}
	public void ekle(Kurs yeni) throws Exception {
	Kurs[] kurslar = 
		{
				new Kurs(1,"Php",10),
				new Kurs(1,".Net",20),
				new Kurs(1,"Java",30)
		};
		
		for (Kurs kurs : kurslar) {
			
			if (kurs.getKursAd().equalsIgnoreCase(yeni.getKursAd())) {
				
				throw new Exception("Kursların adları aynı");
			}
		}
		
		if (yeni.getBirimFiyati() < 0) {
			
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
		}
		
		kursDao.ekle(yeni);
		
		for (ILogger logger : loggers) {
			logger.log(yeni.getKursAd());
		}
}
	}
