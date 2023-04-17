package com.example.codeWriteNow.business.abstracts;

import java.util.List;

import com.example.codeWriteNow.business.requests.SoftwareLanguages.CreateSoftwareLanguageRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.DeleteSoftwareLanguageRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.UpdateSoftwareLanguageRequest;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguageResponse;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguageResponse;

public interface SoftwareLanguageService {

	List<GetAllSoftwareLanguageResponse> getAll();

	GetByIdSoftwareLanguageResponse getById(int id);

	public void add(CreateSoftwareLanguageRequest createSoftwareLanguage);

	public void delete(DeleteSoftwareLanguageRequest deleteSoftwareLanguage);

	public void update(UpdateSoftwareLanguageRequest updateSoftwareLanguage);

}
