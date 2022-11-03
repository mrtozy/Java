package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Kodlama.io.Devs.business.abstracts.ProgramlamaDilService;
import Kodlama.io.Devs.business.abstracts.TeknolojiService;
import Kodlama.io.Devs.business.requests.CreateTechnologyRequest;
import Kodlama.io.Devs.business.requests.DeleteTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetProgrammingLanguageByIdResponse;
import Kodlama.io.Devs.business.responses.GetTechnologyByIdResponse;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.concretes.Technology;

public class TeknolojiManager implements TeknolojiService {
	private TechnologyRepository technologyRepository;
	private ProgramlamaDilService programlamaDilService;

	@Autowired
	public TeknolojiManager(TechnologyRepository technologyRepository, ProgramlamaDilService programlamaDilService) {
		this.technologyRepository = technologyRepository;
		this.programlamaDilService = programlamaDilService;
	}
	@Override
	public void ekle(CreateTechnologyRequest createTechnologyRequest) {
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		GetProgrammingLanguageByIdResponse getProgrammingLanguageByIdResponse = programlamaDilService.getById(createTechnologyRequest.getProgrammingLanguageId());

		programmingLanguage.setId(getProgrammingLanguageByIdResponse.getId());
		programmingLanguage.setName(getProgrammingLanguageByIdResponse.getName());

		technology.setName(createTechnologyRequest.getName());
		technology.setProgramingLanguage(programmingLanguage);

		technologyRepository.save(technology);
		
	}

	@Override
	public void guncelle(UpdateTechnologyRequest updateTechnologyRequest) {
		Technology technology = new Technology();
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		GetProgrammingLanguageByIdResponse getProgrammingLanguageByIdResponse = programlamaDilService.getById(updateTechnologyRequest.getProgrammingLanguageId());

		programmingLanguage.setId(getProgrammingLanguageByIdResponse.getId());
		programmingLanguage.setName(getProgrammingLanguageByIdResponse.getName());

		technology.setId(updateTechnologyRequest.getId());
		technology.setName(updateTechnologyRequest.getName());
		technology.setProgramingLanguage(programmingLanguage);

		technologyRepository.save(technology);
		
	}

	@Override
	public void sil(DeleteTechnologyRequest deleteTechnologyRequest) {
		technologyRepository.deleteById(deleteTechnologyRequest.getId());
		
	}

	@Override
	public List<GetAllTechnologiesResponse> hepsi() {
		List<Technology> technologies = technologyRepository.findAll();
		List<GetAllTechnologiesResponse> getAllTechnologiesResponse = new ArrayList<GetAllTechnologiesResponse>();

		for (Technology technology : technologies) {
			GetAllTechnologiesResponse responseItem = new GetAllTechnologiesResponse();
			responseItem.setId(technology.getId());
			responseItem.setProgrammingLanguageName(technology.getProgramingLanguage().getName());
			responseItem.setName(technology.getName());

			getAllTechnologiesResponse.add(responseItem);
		}

		return getAllTechnologiesResponse;
	}

	@Override
	public GetTechnologyByIdResponse getById(int id) {
		Technology technology = technologyRepository.getReferenceById(id);
		GetTechnologyByIdResponse getTechnologyByIdResponse = new GetTechnologyByIdResponse();

		getTechnologyByIdResponse.setId(technology.getId());
		getTechnologyByIdResponse.setProgrammingLanguageName(technology.getProgramingLanguage().getName());
		getTechnologyByIdResponse.setName(technology.getName());

		return getTechnologyByIdResponse;
	}

}
