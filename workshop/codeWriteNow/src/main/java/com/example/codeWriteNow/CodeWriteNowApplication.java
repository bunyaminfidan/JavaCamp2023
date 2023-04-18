package com.example.codeWriteNow;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CodeWriteNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeWriteNowApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {

		return new ModelMapper();

	}

}
