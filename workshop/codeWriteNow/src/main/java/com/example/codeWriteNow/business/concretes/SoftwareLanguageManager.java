package com.example.codeWriteNow.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.codeWriteNow.business.abstracts.SoftwareLanguageService;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.CreateSoftwareLanguageRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.DeleteSoftwareLanguageRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.UpdateSoftwareLanguageRequest;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguageResponse;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguageResponse;
import com.example.codeWriteNow.entities.SoftwareLanguage;
import com.example.codeWriteNow.repositories.abstracts.SoftwareLanguageRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SoftwareLanguageManager implements SoftwareLanguageService {

	@Autowired
	private SoftwareLanguageRepository languageRepository;

	@Override
	public List<GetAllSoftwareLanguageResponse> getAll() {

		Optional<List<SoftwareLanguage>> optional = Optional.of(languageRepository.findAll());

		List<GetAllSoftwareLanguageResponse> getAllSoftwareLanguages = new ArrayList<GetAllSoftwareLanguageResponse>();

		if (optional.isPresent()) {

			var result = optional.get();

			result.forEach(softwareLanguage -> {
				GetAllSoftwareLanguageResponse getAllSoftwareLanguage = GetAllSoftwareLanguageResponse.builder()
						.id(softwareLanguage.getId()).name(softwareLanguage.getName()).build();

				getAllSoftwareLanguages.add(getAllSoftwareLanguage);

			});

		}

		return getAllSoftwareLanguages;

	}

	@Override
	public GetByIdSoftwareLanguageResponse getById(int id) {
		Optional<SoftwareLanguage> optional = languageRepository.findById(id);

		GetByIdSoftwareLanguageResponse getByIdSoftwareLanguage = new GetByIdSoftwareLanguageResponse();
		if (optional.isPresent()) {

			getByIdSoftwareLanguage.setId(optional.get().getId());
			getByIdSoftwareLanguage.setName(optional.get().getName());

		}
		return getByIdSoftwareLanguage;
	}

	@Override
	public void add(CreateSoftwareLanguageRequest createSoftwareLanguage) {

		SoftwareLanguage language = new SoftwareLanguage();
		language.setName(createSoftwareLanguage.getName());

		languageRepository.save(language);

	}

	@Override
	public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguage) {
		Optional<SoftwareLanguage> optional = languageRepository.findById(deleteSoftwareLanguage.getId());

		if (optional.isPresent()) {
			SoftwareLanguage language = SoftwareLanguage.builder().id(deleteSoftwareLanguage.getId()).build();
			// language.setId(deleteSoftwareLanguage.getId());

			languageRepository.delete(language);
		}

	}

	@Override
	public void update(UpdateSoftwareLanguageRequest updateSoftwareLanguage) {

		Optional<SoftwareLanguage> languageOptional = languageRepository.findById(updateSoftwareLanguage.getId());

		if (languageOptional.isPresent()) {

			var languageRequest = languageOptional.get();

			languageRequest.setName(updateSoftwareLanguage.getName());

			languageRepository.save(languageRequest);
		}

	}

}
