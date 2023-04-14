package com.code.codeProject.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.code.codeProject.business.abstracts.SoftwareLanguageService;
import com.code.codeProject.entities.concretes.SoftwareLanguage;
import com.code.codeProject.repositories.abstracts.SoftwareLanguageRepository;

@Service
public class SoftwareManagerImpl implements SoftwareLanguageService {

	private SoftwareLanguageRepository languageRepository;

	public SoftwareManagerImpl(SoftwareLanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
	}

	@Override
	public void add(SoftwareLanguage softwareLanguage) {
		
		if (softwareLanguage.getName() != "" && softwareLanguage.getName() == "Java") {
			languageRepository.add(softwareLanguage);
		}
		

	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);

	}

	@Override
	public void update(SoftwareLanguage softwareLanguage) {
		languageRepository.update(softwareLanguage);

	}

	@Override
	public SoftwareLanguage getById(int id) {

		return languageRepository.getById(id);
	}

	@Override
	public List<SoftwareLanguage> getAll() {

		return languageRepository.getAll();
	}

}
