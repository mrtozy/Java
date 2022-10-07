package kodlama.Io.dataAccess;

import kodlama.Io.entities.Kurs;

public class JdbcKursDao implements IKursDao {

	@Override
	public void ekle(Kurs kurs) {
		 System.out.println("Jdbc  veritabanına eklendi " + kurs.getKursAd());
		
	}

}
