package com.researchlib.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.researchlib.test.model.ResearchProfessor;

public interface ResearchProfessorRepository extends JpaRepository<ResearchProfessor, Integer> {
	
	@Query("SELECT rp from ResearchProfessor rp WHERE rp.researchId = ?1")
	List<ResearchProfessor> findByResearchId(Integer researchId);

}
