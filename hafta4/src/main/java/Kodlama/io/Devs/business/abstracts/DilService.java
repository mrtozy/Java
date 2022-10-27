package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.Dil;

public interface DilService {
	 public List<Dil> dilGetir();

	    public Dil dilIdGetir(int id);

	    public Dil dilEkle(Dil dil);

	    public Dil dilGuncelle(Dil dil);

	    public void dilSil(int id);

		
}
