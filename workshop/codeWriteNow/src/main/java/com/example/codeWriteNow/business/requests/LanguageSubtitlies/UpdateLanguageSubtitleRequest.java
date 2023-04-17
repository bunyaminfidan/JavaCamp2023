package com.example.codeWriteNow.business.requests.LanguageSubtitlies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguageSubtitleRequest {

	private int id;
	private String name;

}
