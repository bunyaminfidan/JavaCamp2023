package com.example.codeWriteNow.business.responses.LanguageSubtitlies;

import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllLanguageSubtitle {

	private int id;
	private String name;
	private GetAllSoftwareLanguage language;
}
