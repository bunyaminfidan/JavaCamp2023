package com.example.codeWriteNow.business.abstracts;

import java.util.List;

import com.example.codeWriteNow.business.requests.LanguageSubtitlies.CreateLanguageSubtitleRequest;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.DeleteLanguageSubtitleRequest;
import com.example.codeWriteNow.business.requests.LanguageSubtitlies.UpdateLanguageSubtitleRequest;
import com.example.codeWriteNow.business.requests.SoftwareLanguages.DeleteSoftwareLanguageRequest;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetAllLanguageSubtitleResponse;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetByIdLanguageSubtitleResponse;

public interface LanguageSubtitleService {
	
	List<GetAllLanguageSubtitleResponse> getAll();
	
	GetByIdLanguageSubtitleResponse getById(int id);
	
	public void add(CreateLanguageSubtitleRequest createLanguageSubtitle);
	
	public void update(UpdateLanguageSubtitleRequest updateLanguageSubtitleRequest);
	
	public void delete (DeleteLanguageSubtitleRequest deleteSoftwareLanguage);

}
