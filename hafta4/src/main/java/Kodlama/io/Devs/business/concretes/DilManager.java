package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.DilService;
import Kodlama.io.Devs.dataAccess.abstracts.DilRepository;
import Kodlama.io.Devs.entities.concretes.Dil;
@Service

public class DilManager implements DilService {
	private DilRepository dilRepository;
@Autowired	
		public DilManager(DilRepository dilRepository) {
		
		this.dilRepository = dilRepository;
	}
		
	@Override
	public List<Dil> dilGetir() {
		// TODO Auto-generated method stub
		return dilRepository.dilGetir();
	}

	@Override
	public Dil dilIdGetir(int id) {
		
		return dilRepository.dilIdGetir(id);
	}

	@Override
	public Dil dilEkle(Dil dil) {
	
        try {
			return dilRepository.dilEkle(dil);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dil;
	}

	@Override
	public Dil dilGuncelle(Dil dil) {
	    return dilRepository.dilGuncelle( dil);
	}

	@Override
	public void dilSil(int id) {
		dilRepository.dilSil(id);
		
		
	}

	
}
