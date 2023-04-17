package com.example.codeWriteNow.business.responses.LanguageSubtitlies;

import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetAllSoftwareLanguageResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllLanguageSubtitleResponse {

	private int id;
	private String name;
	private GetAllSoftwareLanguageResponse language;
}
