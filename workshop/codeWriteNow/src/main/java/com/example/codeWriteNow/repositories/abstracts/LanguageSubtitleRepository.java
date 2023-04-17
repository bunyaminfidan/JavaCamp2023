package com.example.codeWriteNow.repositories.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.codeWriteNow.entities.LanguageSubtitle;

public interface LanguageSubtitleRepository extends JpaRepository<LanguageSubtitle, Integer> {

	@Query(
			  value = "SELECT count(*) FROM LANGUAGES_SUBTITLIES l WHERE l.id = ?1", 
			  nativeQuery = true)
	int countST(Integer id);
	
}
