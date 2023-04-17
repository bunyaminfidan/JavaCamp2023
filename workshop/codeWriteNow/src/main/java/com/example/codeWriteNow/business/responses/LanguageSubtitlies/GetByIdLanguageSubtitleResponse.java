package com.example.codeWriteNow.business.responses.LanguageSubtitlies;

import com.example.codeWriteNow.business.responses.SoftwareLanguages.GetByIdSoftwareLanguageResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetByIdLanguageSubtitleResponse {

	private int id;
	private String name;
	private GetByIdSoftwareLanguageResponse language;

}
