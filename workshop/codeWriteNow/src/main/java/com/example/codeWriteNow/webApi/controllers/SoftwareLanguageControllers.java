package com.example.codeWriteNow.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeWriteNow.business.abstracts.SoftwareLanguageService;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.CreateSoftwareLanguage;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.DeleteSoftwareLanguage;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.UpdateSoftwareLanguage;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguage;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguage;

@RestController
@RequestMapping("/api/softwarelanguages")
public class SoftwareLanguageControllers {

	
	private final SoftwareLanguageService softwareLanguageService;

	public SoftwareLanguageControllers(SoftwareLanguageService softwareLanguageService) {

		this.softwareLanguageService = softwareLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllSoftwareLanguage> getAll() {
		return softwareLanguageService.getAll();
	}

	@GetMapping("/getbyid")
	public GetByIdSoftwareLanguage getById(int id) {
		return softwareLanguageService.getById(id);
	}

	@PostMapping("/add")
	public void add(CreateSoftwareLanguage createSoftwareLanguage) {
		softwareLanguageService.add(createSoftwareLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(DeleteSoftwareLanguage deleteSoftwareLanguage) {
		softwareLanguageService.delete(deleteSoftwareLanguage);
	}

	@PostMapping("/update")
	public void update(UpdateSoftwareLanguage updateSoftwareLanguage) {
		softwareLanguageService.update(updateSoftwareLanguage);
	}

}
