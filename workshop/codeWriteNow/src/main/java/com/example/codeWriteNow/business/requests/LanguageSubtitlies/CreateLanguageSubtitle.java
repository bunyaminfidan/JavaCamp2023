package com.example.codeWriteNow.business.requests.LanguageSubtitlies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateLanguageSubtitle {

	private int softwareLanguageId;
	private String name;

}
