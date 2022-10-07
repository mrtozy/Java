package kodlama.Io.business;

import kodlama.Io.core.loging.ILogger;
import kodlama.Io.dataAccess.IEgitmenDao;
import kodlama.Io.entities.Egitmen;

public class EgitmenManager {
	private IEgitmenDao egitmendao;
	private ILogger[] loggers;
	
	public EgitmenManager(IEgitmenDao egitmendao, ILogger[] loggers) {
		this.egitmendao = egitmendao;
		this.loggers = loggers;
	}

	public void ekle(Egitmen egitmen) {
		egitmendao.ekle(egitmen);
		
		for (ILogger logger : loggers) {
			logger.log(egitmen.getAd());
		}
	}
}
