package Kodlama.io.Devs.business.abstracts;
import java.util.List;

import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;

public interface TeknolojiService {
	void ekle(CreateTechnologyRequest createTechnologyRequest);
	void guncelle(UpdateTechnologyRequest updateTechnologyRequest);
	void sil(DeleteTechnologyRequest deleteTechnologyRequest);
	List<GetAllTechnologiesResponse> hepsi();
	GetTechnologyByIdResponse getById(int id);
}
