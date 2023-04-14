package com.code.codeProject.repositories.abstracts;

import java.util.List;

import com.code.codeProject.entities.concretes.SoftwareLanguage;

public interface SoftwareLanguageRepository {

	void add(SoftwareLanguage softwareLanguage);

	void delete(int id);

	void update(SoftwareLanguage softwareLanguage);

	SoftwareLanguage getById(int id);

	List<SoftwareLanguage> getAll();

}
