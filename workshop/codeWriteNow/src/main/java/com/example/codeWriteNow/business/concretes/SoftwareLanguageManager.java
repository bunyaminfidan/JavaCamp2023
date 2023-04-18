package com.example.codeWriteNow.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.codeWriteNow.business.abstracts.SoftwareLanguageService;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.CreateSoftwareLanguageRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.DeleteSoftwareLanguageRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.UpdateSoftwareLanguageRequest;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguageResponse;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguageResponse;
import com.example.codeWriteNow.common.utilities.mapper.ModelMapperService;
import com.example.codeWriteNow.entities.SoftwareLanguage;
import com.example.codeWriteNow.repositories.abstracts.SoftwareLanguageRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SoftwareLanguageManager implements SoftwareLanguageService {

	@Autowired
	private SoftwareLanguageRepository languageRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllSoftwareLanguageResponse> getAll() {

		Optional<List<SoftwareLanguage>> optional = Optional.of(languageRepository.findAll());

		List<GetAllSoftwareLanguageResponse> getAllResponse = optional.get().stream().map(
				language -> this.modelMapperService.forResponse().map(language, GetAllSoftwareLanguageResponse.class))
				.collect(Collectors.toList());

		return getAllResponse;

	}

	@Override
	public GetByIdSoftwareLanguageResponse getById(int id) {

		Optional<SoftwareLanguage> optional = languageRepository.findById(id);

		GetByIdSoftwareLanguageResponse getResponse = this.modelMapperService.forResponse().map(optional.get(),
				GetByIdSoftwareLanguageResponse.class);

		return getResponse;
	}

	@Override
	public void add(CreateSoftwareLanguageRequest createSoftwareLanguage) {

		SoftwareLanguage language = this.modelMapperService.forRequest().map(createSoftwareLanguage,
				SoftwareLanguage.class);

		languageRepository.save(language);

	}

	@Override
	public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguage) {
		Optional<SoftwareLanguage> optional = languageRepository.findById(deleteSoftwareLanguage.getId());

		if (optional.isPresent()) {
			SoftwareLanguage language = this.modelMapperService.forRequest().map(deleteSoftwareLanguage,
					SoftwareLanguage.class);

			languageRepository.delete(language);
		}

	}

	@Override
	public void update(UpdateSoftwareLanguageRequest updateSoftwareLanguage) {

		Optional<SoftwareLanguage> languageOptional = languageRepository.findById(updateSoftwareLanguage.getId());

		if (languageOptional.isPresent()) {
			SoftwareLanguage language = this.modelMapperService.forRequest().map(updateSoftwareLanguage,
					SoftwareLanguage.class);

			languageRepository.save(language);
		}

	}

}
