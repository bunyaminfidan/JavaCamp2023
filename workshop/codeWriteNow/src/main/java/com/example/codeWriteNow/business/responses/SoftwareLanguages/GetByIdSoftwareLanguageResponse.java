package com.example.codeWriteNow.business.responses.SoftwareLanguages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetByIdSoftwareLanguageResponse {

	private int id;
	private String name;
}
