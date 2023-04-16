package com.example.codeWriteNow.business.abstracts;

import java.util.List;

import com.example.codeWriteNow.business.requests.LanguageSubtitlies.CreateLanguageSubtitle;
import com.example.codeWriteNow.business.responses.LanguageSubtitlies.GetAllLanguageSubtitle;

public interface LanguageSubtitleService {
	
	List<GetAllLanguageSubtitle> getAll();
	
	public void add(CreateLanguageSubtitle createLanguageSubtitle);

}
