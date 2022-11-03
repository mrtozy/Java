package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Kodlama.io.Devs.business.abstracts.ProgramlamaDilService;
import Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;
import Kodlama.io.Devs.business.responses.GetProgrammingLanguageByIdResponse;
import Kodlama.io.Devs.dataAccess.abstracts.ProgramlamaDilRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class ProgramlamaDilManager implements ProgramlamaDilService{
	private ProgramlamaDilRepository programlamaDilRepository;

	@Autowired
	public ProgramlamaDilManager(ProgramlamaDilRepository programlamaDilRepository) {
		this.programlamaDilRepository = programlamaDilRepository;
	}
	@Override
	public void ekle(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		try {
			ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
			programmingLanguage.setName(createProgrammingLanguageRequest.getName());

			if(isProgrammingLanguageExist(programmingLanguage)) throw new Exception("Bu programlama dili zaten var");
			if(isProgrammingLanguageEmpty(programmingLanguage)) throw new Exception("Programlama dili boş bırakılamaz");

			programlamaDilRepository.save(programmingLanguage);
		} catch (Exception exception) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void guncelle(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setId(updateProgrammingLanguageRequest.getId());
		programmingLanguage.setName(updateProgrammingLanguageRequest.getName());

		programlamaDilRepository.save(programmingLanguage);
		
	}

	@Override
	public void sil(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
		programlamaDilRepository.deleteById(deleteProgrammingLanguageRequest.getId());
		
	}

	@Override
	public List<GetAllProgrammingLanguagesResponse> hepsiniGetir() {
		List<ProgrammingLanguage> programmingLanguages = programlamaDilRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> getAllProgrammingLanguagesResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();

		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());

			getAllProgrammingLanguagesResponse.add(responseItem);
		}

		return getAllProgrammingLanguagesResponse;
	}

	@Override
	public GetProgrammingLanguageByIdResponse getById(int id) {
		ProgrammingLanguage programmingLanguage = programlamaDilRepository.getReferenceById(id);
		GetProgrammingLanguageByIdResponse getProgrammingLanguageByIdResponse = new GetProgrammingLanguageByIdResponse();

		getProgrammingLanguageByIdResponse.setId(programmingLanguage.getId());
		getProgrammingLanguageByIdResponse.setName(programmingLanguage.getName());

		return getProgrammingLanguageByIdResponse;
	}
	
	private boolean isProgrammingLanguageExist(ProgrammingLanguage programmingLanguage){
        for (ProgrammingLanguage languages : this.programlamaDilRepository.findAll()){
            if (languages.getName().equals(programmingLanguage.getName())){
                return true;
            }
        }
        return false;
    }

    private boolean isProgrammingLanguageEmpty(ProgrammingLanguage programmingLanguage){
    	return programmingLanguage.getName().isEmpty() || programmingLanguage.getName().isBlank();
    }


}
