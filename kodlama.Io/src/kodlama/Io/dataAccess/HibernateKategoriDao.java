package kodlama.Io.dataAccess;

import kodlama.Io.entities.Kategori;

public class HibernateKategoriDao implements IKategoriDao{

	

	@Override
	public void ekle(Kategori kategori) {
		System.out.println("Hibernate  veritabanına eklendi " + kategori.getkategoriAd());		
		
	}

}
