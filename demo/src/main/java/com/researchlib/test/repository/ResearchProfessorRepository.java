package com.researchlib.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.researchlib.test.model.ResearchProfessor;

public interface ResearchProfessorRepository extends JpaRepository<ResearchProfessor, Integer> {

}
