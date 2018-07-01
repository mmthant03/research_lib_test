package com.researchlib.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.researchlib.test.model.ResearchResearcher;

public interface ResearchResearcherRepository extends JpaRepository<ResearchResearcher, Integer> {


	@Query("SELECT rr from ResearchResearcher rr WHERE rr.researchId = ?1")
	List<ResearchResearcher> findByResearchId(Integer researchId);
}
