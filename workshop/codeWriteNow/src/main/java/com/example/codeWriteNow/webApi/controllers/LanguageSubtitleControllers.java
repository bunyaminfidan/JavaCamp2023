package com.example.codeWriteNow.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeWriteNow.business.abstracts.LanguageSubtitleService;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.CreateLanguageSubtitleRequest;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.DeleteLanguageSubtitleRequest;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.UpdateLanguageSubtitleRequest;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetAllLanguageSubtitleResponse;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetByIdLanguageSubtitleResponse;

@RestController
@RequestMapping("/api/languagesubtitlies")
public class LanguageSubtitleControllers {

	private LanguageSubtitleService service;

	public LanguageSubtitleControllers(LanguageSubtitleService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getall")
	public List<GetAllLanguageSubtitleResponse> getAll() {
		return service.getAll();
	}

	@GetMapping("/getbyid")
	public GetByIdLanguageSubtitleResponse getById(int id) {
		return service.getById(id);
	}

	@PostMapping("/add")
	public void addC(CreateLanguageSubtitleRequest createLanguageSubtitle) {
		service.add(createLanguageSubtitle);
	}

	@PostMapping("/update")
	public void update(UpdateLanguageSubtitleRequest createLanguageSubtitle) {
		service.update(createLanguageSubtitle);
	}

	@DeleteMapping("delete")
	public void delete(DeleteLanguageSubtitleRequest deleteLanguageSubtitleRequest) {
		service.delete(deleteLanguageSubtitleRequest);
	}

}
