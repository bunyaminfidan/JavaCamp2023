package com.example.codeWriteNow.business.abstracts;

import java.util.List;

import com.example.codeWriteNow.business.requests.SoftwareLanguages.CreateSoftwareLanguage;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.DeleteSoftwareLanguage;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.UpdateSoftwareLanguage;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguage;
import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguage;

public interface SoftwareLanguageService {

	List<GetAllSoftwareLanguage> getAll();

	GetByIdSoftwareLanguage getById(int id);

	public void add(CreateSoftwareLanguage createSoftwareLanguage);

	public void delete(DeleteSoftwareLanguage deleteSoftwareLanguage);

	public void update(UpdateSoftwareLanguage updateSoftwareLanguage);

}
