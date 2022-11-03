package Kodlama.io.Devs.wepApi;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.TeknolojiService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;
@RestController
@RequestMapping("/api/teknolojiler")
public class TechnologiesController {

	private TeknolojiService teknolojiService;

    @Autowired
    public TechnologiesController(TeknolojiService teknolojiService) {
        this.teknolojiService = teknolojiService;
    }

    @PostMapping("/ekle")
    public void ekle(CreateTechnologyRequest createTechnologyRequest) throws Exception {
    	teknolojiService.ekle(createTechnologyRequest);
    }

    @PostMapping("/guncelle")
    public void guncelle(UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
    	teknolojiService.guncelle(updateTechnologyRequest);
    }

    @DeleteMapping("/sil")
	public void sil(DeleteTechnologyRequest deleteTechnologyRequest) {
    	teknolojiService.sil(deleteTechnologyRequest);
	}

    @GetMapping("/hepsi")
    public List<GetAllTechnologiesResponse> hepsi() {
        return teknolojiService.hepsi();
    }

    @GetMapping("/{id}")
	public GetTechnologyByIdResponse getById(@PathVariable int id) {
		return teknolojiService.getById(id);
	}

}