package kodlama.Io.dataAccess;

import kodlama.Io.entities.Egitmen;

public class HibernateEgitmenDao implements IEgitmenDao{


	@Override
	public void ekle(Egitmen egitmen) {
		System.out.println("Hibernate  veritabanına eklendi " + egitmen.getAd()+" "
				+egitmen.getSoyAd());
	}

}
