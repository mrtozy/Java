package kodlama.Io.dataAccess;

import kodlama.Io.entities.Kategori;

public class JdbcKategoriDao implements IKategoriDao{
 
	 @Override
	 public void ekle(Kategori kategori) {
		 System.out.println("Jdbc  veritabanına eklendi " + kategori.getkategoriAd());		
	 	
	 }
}


