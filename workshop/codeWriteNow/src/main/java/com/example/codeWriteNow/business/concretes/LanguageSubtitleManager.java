package com.example.codeWriteNow.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.codeWriteNow.business.abstracts.LanguageSubtitleService;
import com.example.codeWriteNow.business.abstracts.SoftwareLanguageService;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.CreateLanguageSubtitle;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetAllLanguageSubtitle;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguage;
import com.example.codeWriteNow.entities.LanguageSubtitle;
import com.example.codeWriteNow.entities.SoftwareLanguage;
import com.example.codeWriteNow.repositories.abstracts.LanguageSubtitleRepository;
import com.example.codeWriteNow.repositories.abstracts.SoftwareLanguageRepository;

@Service
public class LanguageSubtitleManager implements LanguageSubtitleService {

	private LanguageSubtitleRepository subtitleRepository;
	private SoftwareLanguageRepository languageRepository;

	public LanguageSubtitleManager(LanguageSubtitleRepository subtitleRepository,
			SoftwareLanguageRepository languageRepository) {
		super();
		this.subtitleRepository = subtitleRepository;
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguageSubtitle> getAll() {
		List<LanguageSubtitle> languageSubtitles = subtitleRepository.findAll();

		List<GetAllLanguageSubtitle> getAllLanguageSubtitles = new ArrayList<>();

		for (LanguageSubtitle subtitle : languageSubtitles) {
			GetAllLanguageSubtitle languageSubtitle = new GetAllLanguageSubtitle();

			languageSubtitle.setId(subtitle.getId());
			languageSubtitle.setName(subtitle.getName());

			languageSubtitle.setLanguage(new GetAllSoftwareLanguage(subtitle.getSoftwareLanguage().getId(),
					subtitle.getSoftwareLanguage().getName()));

			getAllLanguageSubtitles.add(languageSubtitle);
		}

		return getAllLanguageSubtitles;
	}

	@Override
	public void add(CreateLanguageSubtitle createLanguageSubtitle) {

		LanguageSubtitle subtitle = new LanguageSubtitle();

		SoftwareLanguage language = languageRepository.getById(createLanguageSubtitle.getSoftwareLanguageId());

		subtitle.setName(createLanguageSubtitle.getName());
		subtitle.setSoftwareLanguage(language);

		System.out.println(subtitle.getId() + subtitle.getName() + subtitle.getSoftwareLanguage().getId()
				+ subtitle.getSoftwareLanguage().getName());

		subtitleRepository.save(subtitle);

	}

}
