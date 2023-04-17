package com.example.codeWriteNow.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.codeWriteNow.business.abstracts.LanguageSubtitleService;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.CreateLanguageSubtitleRequest;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.DeleteLanguageSubtitleRequest;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.UpdateLanguageSubtitleRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.DeleteSoftwareLanguageRequest;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetAllLanguageSubtitleResponse;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetByIdLanguageSubtitleResponse;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguageResponse;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguageResponse;
import com.example.codeWriteNow.entities.LanguageSubtitle;
import com.example.codeWriteNow.entities.SoftwareLanguage;
import com.example.codeWriteNow.repositories.abstracts.LanguageSubtitleRepository;
import com.example.codeWriteNow.repositories.abstracts.SoftwareLanguageRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
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
	public List<GetAllLanguageSubtitleResponse> getAll() {
		Optional<List<LanguageSubtitle>> optional = Optional.of(subtitleRepository.findAll());

		List<GetAllLanguageSubtitleResponse> getAllLanguageSubtitles = new ArrayList<>();

		if (optional.isPresent()) {

			var request = optional.get();

			request.forEach(language -> {
				GetAllLanguageSubtitleResponse languageSubtitle = GetAllLanguageSubtitleResponse.builder()
						.id(language.getId()).name(language.getName())
						.language(new GetAllSoftwareLanguageResponse(language.getSoftwareLanguage().getId(),
								language.getSoftwareLanguage().getName()))
						.build();

				getAllLanguageSubtitles.add(languageSubtitle);

			});

		}

		return getAllLanguageSubtitles;
	}

	@Override
	public GetByIdLanguageSubtitleResponse getById(int id) {

		Optional<LanguageSubtitle> optional = subtitleRepository.findById(id);
		GetByIdLanguageSubtitleResponse getByIdLanguageSubtitleResponse = new GetByIdLanguageSubtitleResponse();

		if (optional.isPresent()) {

			var request = optional.get();

			getByIdLanguageSubtitleResponse = GetByIdLanguageSubtitleResponse.builder().id(request.getId())
					.name(request.getName())
					.language(new GetByIdSoftwareLanguageResponse(request.getSoftwareLanguage().getId(),
							request.getSoftwareLanguage().getName()))

					.build();

		}

		return getByIdLanguageSubtitleResponse;
	}

	@Override
	public void add(CreateLanguageSubtitleRequest createLanguageSubtitle) {

		LanguageSubtitle subtitle = new LanguageSubtitle();

		Optional<SoftwareLanguage> language = languageRepository
				.findById(createLanguageSubtitle.getSoftwareLanguageId());
		if (language.isPresent()) {
			subtitle.setName(createLanguageSubtitle.getName());
			subtitle.setSoftwareLanguage(language.get());
		}

		log.info(subtitle.getName());
		subtitleRepository.save(subtitle);

	}

	@Override
	public void update(UpdateLanguageSubtitleRequest updateLanguageSubtitleRequest) {

		Optional<LanguageSubtitle> requestLanguageOptional = subtitleRepository
				.findById(updateLanguageSubtitleRequest.getId());

		if (requestLanguageOptional.isPresent()) {
			var subtitleRequest = requestLanguageOptional.get();

			subtitleRequest.setName(updateLanguageSubtitleRequest.getName());
			Optional<SoftwareLanguage> softwareLanguageOptional = languageRepository
					.findById(subtitleRequest.getSoftwareLanguage().getId());

			subtitleRequest.setSoftwareLanguage(softwareLanguageOptional.get());

			subtitleRepository.save(subtitleRequest);

		}

	}

	@Override
	public void delete(DeleteLanguageSubtitleRequest deleteSoftwareLanguage) {

		Optional<LanguageSubtitle> optional = subtitleRepository.findById(deleteSoftwareLanguage.getId());
		if (optional.isPresent()) {

			LanguageSubtitle languageSubtitle = LanguageSubtitle.builder().id(optional.get().getId()).build();

			subtitleRepository.delete(languageSubtitle);

		}
	}

}
