package com.example.codeWriteNow.business.requests.SoftwareLanguages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateSoftwareLanguageRequest {

	private int id;
	private String name;
}
