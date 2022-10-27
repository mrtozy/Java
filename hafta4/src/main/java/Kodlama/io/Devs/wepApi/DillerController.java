package Kodlama.io.Devs.wepApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.DilService;
import Kodlama.io.Devs.entities.concretes.Dil;
import io.swagger.v3.oas.annotations.parameters.RequestBody;



@RestController
@RequestMapping("/api/diller")
public class DillerController {
	private DilService dilService;
	@Autowired
	public DillerController(DilService dilService) {
		
		this.dilService = dilService;
	}
	@GetMapping("/dilgetir")
	public List<Dil> dilGetir(){
	return dilService.dilGetir();	
	}
	@GetMapping("/dilidgetir/{id}")
	public Dil dilIdGetir(@PathVariable int id){
	return  dilService.dilIdGetir(id);	
	}
	 @DeleteMapping("/dilSil/{id}")
	    public String dilSil(@PathVariable int id) {
		 dilService.dilSil(id);
	        return "Dil Silindi";
	    }

	    @PutMapping("/dilguncelle/{id}")
	   public Dil dilGuncelle( Dil dil) {
	    	dilService.dilGuncelle(dil);
	        return dil;
	    }

	    @PostMapping("/dilEkle")
	    public Dil    dilEkle           (Dil dil) {
	    	 
	    	if (dil.getDil().isEmpty() || dil.getDil().isBlank()) { 
	            throw new RuntimeException("Dil Boş Bırakılamaz");
	        }{
	        	 return dilService.dilEkle(dil);
	        }
	       
	    }
}
