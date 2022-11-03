package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.DeleteProgrammingLanguageRequest;
import Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageRequest;
import Kodlama.io.Devs.business.responses.GetProgrammingLanguageByIdResponse;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguagesResponse;

public interface ProgramlamaDilService {
	void ekle(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	void guncelle(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	void sil(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
	List<GetAllProgrammingLanguagesResponse> hepsiniGetir();
	GetProgrammingLanguageByIdResponse getById(int id);
}
