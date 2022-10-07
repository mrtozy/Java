package kodlama.Io;
import kodlama.Io.business.EgitmenManager;
import kodlama.Io.business.KategoriManager;
import kodlama.Io.business.KursManager;
import kodlama.Io.core.loging.DatabaseLogger;
import kodlama.Io.core.loging.FileLogger;
import kodlama.Io.core.loging.ILogger;
import kodlama.Io.dataAccess.HibernateEgitmenDao;
import kodlama.Io.dataAccess.HibernateKategoriDao;
import kodlama.Io.dataAccess.HibernateKursDao;
import kodlama.Io.dataAccess.JdbcKategoriDao;
import kodlama.Io.entities.Egitmen;
import kodlama.Io.entities.Kategori;
import kodlama.Io.entities.Kurs;

public class Main {

	public static void main(String[] args) throws Exception {
		Egitmen egitmen=new Egitmen(1,"mrtozy","mrtozy","mail");
		Kurs kurs = new Kurs(10,"Kotlin",50);
		Kategori kategori= new Kategori(2,"Web Tasarım");
	//	ILogger[] loggers= {new DatabaseLogger(),new FileLogger(),new FileLogger() };
		ILogger[] loggers= {new DatabaseLogger() };
		EgitmenManager egitmenManager = new EgitmenManager(new HibernateEgitmenDao(),loggers);
		egitmenManager.ekle(egitmen);
		
		KategoriManager kategoriManager= new KategoriManager(new HibernateKategoriDao(),loggers);
		kategoriManager.ekle(kategori);
		
		KursManager kursManager = new KursManager(new HibernateKursDao(), loggers);
		kursManager.ekle(kurs);	
	}

}
