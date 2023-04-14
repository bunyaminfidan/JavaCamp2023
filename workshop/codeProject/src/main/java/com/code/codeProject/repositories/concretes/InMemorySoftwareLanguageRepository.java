package com.code.codeProject.repositories.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.code.codeProject.entities.concretes.SoftwareLanguage;
import com.code.codeProject.repositories.abstracts.SoftwareLanguageRepository;

@Repository
public class InMemorySoftwareLanguageRepository implements SoftwareLanguageRepository {

	private List<SoftwareLanguage> softwareLanguages;

	public InMemorySoftwareLanguageRepository() {

		softwareLanguages = new ArrayList<SoftwareLanguage>();
		softwareLanguages.add(new SoftwareLanguage(1, "Java"));
		softwareLanguages.add(new SoftwareLanguage(2, "C"));
		softwareLanguages.add(new SoftwareLanguage(3, "C#"));
		softwareLanguages.add(new SoftwareLanguage(4, "C++"));
		softwareLanguages.add(new SoftwareLanguage(5, "React"));

	}

	@Override
	public void add(SoftwareLanguage softwareLanguage) {
		softwareLanguages.add(softwareLanguage);

	}

	@Override
	public void delete(int id) {

		for (SoftwareLanguage softwareLanguage : softwareLanguages) {
			if (softwareLanguage.getId() == id) {

				softwareLanguages.remove(softwareLanguage);

			}
		}

	}

	@Override
	public void update(SoftwareLanguage softwareLanguage) {
		for (SoftwareLanguage language : softwareLanguages) {
			if (language.getId() == softwareLanguage.getId()) {

				language.setName(softwareLanguage.getName());

			}

		}

	}

	@Override
	public SoftwareLanguage getById(int id) {
		SoftwareLanguage language = new SoftwareLanguage();

		// return softwareLanguages.get(id);

		for (SoftwareLanguage softwareLanguage : softwareLanguages) {
			if (softwareLanguage.getId() == id) {
				language = softwareLanguage;
				System.out.println(language.getId() + "  - " + language.getName());

			}

		}
		return language;
	}

	@Override
	public List<SoftwareLanguage> getAll() {
		// TODO Auto-generated method stub
		return softwareLanguages;
	}

}
