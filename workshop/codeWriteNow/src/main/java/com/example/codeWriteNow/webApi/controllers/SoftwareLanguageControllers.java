package com.example.codeWriteNow.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeWriteNow.business.abstracts.SoftwareLanguageService;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.CreateSoftwareLanguageRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.DeleteSoftwareLanguageRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.UpdateSoftwareLanguageRequest;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguageResponse;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguageResponse;

@RestController
@RequestMapping("/api/softwarelanguages")
public class SoftwareLanguageControllers {

	
	private final SoftwareLanguageService softwareLanguageService;

	public SoftwareLanguageControllers(SoftwareLanguageService softwareLanguageService) {

		this.softwareLanguageService = softwareLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllSoftwareLanguageResponse> getAll() {
		return softwareLanguageService.getAll();
	}

	@GetMapping("/getbyid")
	public GetByIdSoftwareLanguageResponse getById(int id) {
		return softwareLanguageService.getById(id);
	}

	@PostMapping("/add")
	public void add(CreateSoftwareLanguageRequest createSoftwareLanguage) {
		softwareLanguageService.add(createSoftwareLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguage) {
		softwareLanguageService.delete(deleteSoftwareLanguage);
	}

	@PostMapping("/update")
	public void update(UpdateSoftwareLanguageRequest updateSoftwareLanguage) {
		softwareLanguageService.update(updateSoftwareLanguage);
	}

}
