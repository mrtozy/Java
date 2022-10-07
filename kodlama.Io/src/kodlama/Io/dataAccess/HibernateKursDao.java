package kodlama.Io.dataAccess;

import kodlama.Io.entities.Kurs;

public class HibernateKursDao implements  IKursDao {

	@Override
	public void ekle(Kurs kurs) {
		System.out.println("Hibernate  veritabanına eklendi " + kurs.getKursAd());		
		
	}

}
