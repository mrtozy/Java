package kodlama.Io.dataAccess;

import kodlama.Io.entities.Egitmen;

public class JdbcEgitmenDao implements IEgitmenDao{

	@Override
	public void ekle(Egitmen egitmen) {
		System.out.println("Jdbc veritabanına eklendi " + egitmen.getAd()+" "
	+egitmen.getSoyAd());
		
	}

	
	

}
