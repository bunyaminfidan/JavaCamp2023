package com.example.codeWriteNow.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.codeWriteNow.business.abstracts.SoftwareLanguageService;
import com.example.codeWriteNow.business.requests.CreateSoftwareLanguage;
import com.example.codeWriteNow.business.requests.DeleteSoftwareLanguage;
import com.example.codeWriteNow.business.requests.UpdateSoftwareLanguage;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguage;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguage;
import com.example.codeWriteNow.entities.SoftwareLanguage;
import com.example.codeWriteNow.repositories.abstracts.SoftwareLanguageRepository;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {

	@Autowired
	private SoftwareLanguageRepository languageRepository;

	@Override
	public List<GetAllSoftwareLanguage> getAll() {

		List<SoftwareLanguage> softwareLanguages = languageRepository.findAll();
		List<GetAllSoftwareLanguage> getAllSoftwareLanguages = new ArrayList<GetAllSoftwareLanguage>();

		for (SoftwareLanguage softwareLanguage : softwareLanguages) {
			GetAllSoftwareLanguage allSoftwareLanguage = new GetAllSoftwareLanguage();

			allSoftwareLanguage.setId(softwareLanguage.getId());
			allSoftwareLanguage.setName(softwareLanguage.getName());

			getAllSoftwareLanguages.add(allSoftwareLanguage);

		}

		return getAllSoftwareLanguages;

	}

	@Override
	public GetByIdSoftwareLanguage getById(int id) {
		SoftwareLanguage language = new SoftwareLanguage();
		language = languageRepository.getById(id);
		
		GetByIdSoftwareLanguage getByIdSoftwareLanguage = new GetByIdSoftwareLanguage();
		getByIdSoftwareLanguage.setId(language.getId());
		getByIdSoftwareLanguage.setName(language.getName());

		return getByIdSoftwareLanguage;
	}

	@Override
	public void add(CreateSoftwareLanguage createSoftwareLanguage) {

		SoftwareLanguage language = new SoftwareLanguage();
		language.setName(createSoftwareLanguage.getName());

		languageRepository.save(language);

	}

	@Override
	public void delete(DeleteSoftwareLanguage deleteSoftwareLanguage) {
		SoftwareLanguage language = new SoftwareLanguage();
		language.setId(deleteSoftwareLanguage.getId());

		languageRepository.delete(language);
	}

	@Override
	public void update(UpdateSoftwareLanguage updateSoftwareLanguage) {
		SoftwareLanguage language = new SoftwareLanguage();
		language.setId(updateSoftwareLanguage.getId());
		language.setName(updateSoftwareLanguage.getName());

		if ((languageRepository.findById(updateSoftwareLanguage.getId())).isEmpty() == false) {

			languageRepository.save(language);
		}

	}
	
}
