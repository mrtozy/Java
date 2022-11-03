package Kodlama.io.Devs.wepApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgramlamaDilService;
import Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetProgrammingLanguageByIdResponse;


@RestController
@RequestMapping("/api/programlamaDilleri")
public class ProgrammingLanguagesController {

    private ProgramlamaDilService programlamaDilService;

    @Autowired
    public ProgrammingLanguagesController(ProgramlamaDilService programlamaDilService) {
        this.programlamaDilService = programlamaDilService;
    }

    @PostMapping("/ekle")
    public void ekle(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) throws Exception {
    	programlamaDilService.ekle(createProgrammingLanguageRequest);
    }

    @PostMapping("/guncelle")
    public void guncelle(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) throws Exception {
    	programlamaDilService.guncelle(updateProgrammingLanguageRequest);
    }

    @DeleteMapping("/sil")
	public void sil(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
    	programlamaDilService.sil(deleteProgrammingLanguageRequest);
	}

    @GetMapping("/hepsi")
    public List<GetAllProgrammingLanguagesResponse> hepsi() {
        return programlamaDilService.hepsiniGetir();
    }

    @GetMapping("/{id}")
	public GetProgrammingLanguageByIdResponse getById(@PathVariable int id) {
		return programlamaDilService.getById(id);
	}
}