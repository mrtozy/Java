package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Dil;

public interface DilRepository {
	 public List<Dil> dilGetir();

	    public Dil dilIdGetir(int id);

	    public Dil dilEkle(Dil dil)throws Exception;

	    public Dil dilGuncelle( Dil dil);

	    public void dilSil(int id);
}
