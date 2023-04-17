package com.example.codeWriteNow.business.responses.SoftwareLanguages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAllSoftwareLanguageResponse {

	private int id;
	private String name;

}
