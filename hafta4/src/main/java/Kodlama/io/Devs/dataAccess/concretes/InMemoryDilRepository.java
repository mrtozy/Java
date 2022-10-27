package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import Kodlama.io.Devs.dataAccess.abstracts.DilRepository;
import Kodlama.io.Devs.entities.concretes.Dil;
@Repository
public class InMemoryDilRepository implements DilRepository{
	List<Dil> diller;

    public InMemoryDilRepository() {
    	diller = new ArrayList<>();
    	diller.add(new Dil(1, "C#"));
    	diller.add(new Dil(2, "Java"));
    	diller.add(new Dil(3, "Python"));
       

    }
	@Override
	public List<Dil> dilGetir() {
		// TODO Auto-generated method stub
		return diller;
	}

	@Override
	public Dil dilIdGetir(int id) {
		// TODO Auto-generated method stub
		  List<Dil> dil = diller.stream().toList();
	           
	        return dil.get(id);
	}

	@Override
	public Dil dilEkle(Dil dil) {
		  boolean dil_ad = diller.stream().anyMatch(a -> a.getDil().equals(dil.getDil()));
		  boolean dil_id=  diller.stream().anyMatch( b->String.valueOf(b.getId()).equals(String.valueOf(dil.getId())));
		  
		 
		  if(dil_id) {
	        	 throw new RuntimeException("Bu Id Var");
	        }
		  else if (dil_ad) {
	            throw new RuntimeException("Bu Dil Var");
	        } 
	        else {diller.add(dil);}
	        
	        
	        return dil;
	}

	@Override
	public Dil dilGuncelle( Dil dil) {
		 Optional<Dil> dilGuncelle = diller.stream()
	                .filter(a -> a.getId() == dil.getId()).findFirst();
	        int index = diller.indexOf(dilGuncelle.get());
	        diller.set(index, dil);
	        return null;
	}

	@Override
	public void dilSil(int id) {
		 Optional<Dil> dilSil = diller.stream()
	                .filter(a -> a.getId() == id).findFirst();
	        diller.remove(dilSil.get());
		
	}

}
