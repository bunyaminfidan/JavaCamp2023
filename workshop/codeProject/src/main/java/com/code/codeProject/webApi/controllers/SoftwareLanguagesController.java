package com.code.codeProject.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.codeProject.entities.concretes.SoftwareLanguage;
import com.code.codeProject.repositories.abstracts.SoftwareLanguageRepository;

@RestController
@RequestMapping("/api/softwarelanguages")
public class SoftwareLanguagesController {

	private SoftwareLanguageRepository languageRepository;

	public SoftwareLanguagesController(SoftwareLanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@GetMapping("/getall")
	public List<SoftwareLanguage> getAll() {

		return languageRepository.getAll();

	}

	@GetMapping("/getbyid/{id}")
	public SoftwareLanguage getById(@PathVariable("id") int id) {
		return languageRepository.getById(id);
	}

	@PostMapping("/add")
	public void add(@RequestBody SoftwareLanguage softwareLanguage) {
		languageRepository.add(softwareLanguage);

	}
	
	@PostMapping("/update")
	public void update(@RequestBody SoftwareLanguage softwareLanguage) {
		languageRepository.update(softwareLanguage);

	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		languageRepository.delete(id);
	}

}
