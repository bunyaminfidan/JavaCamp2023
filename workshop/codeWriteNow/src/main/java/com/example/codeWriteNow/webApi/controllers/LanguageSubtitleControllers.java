package com.example.codeWriteNow.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeWriteNow.business.abstracts.LanguageSubtitleService;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.CreateLanguageSubtitle;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetAllLanguageSubtitle;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguage;

@RestController
@RequestMapping("/api/languagesubtitlies")
public class LanguageSubtitleControllers {

	private LanguageSubtitleService service;

	public LanguageSubtitleControllers(LanguageSubtitleService service) {
		super();
		this.service = service;
	}

	@GetMapping("/getall")
	public List<GetAllLanguageSubtitle> getAll() {
		return service.getAll();
	}
	
	@PostMapping("/add")
	public void addC(CreateLanguageSubtitle createLanguageSubtitle) {
		service.add(createLanguageSubtitle);
	}

}
