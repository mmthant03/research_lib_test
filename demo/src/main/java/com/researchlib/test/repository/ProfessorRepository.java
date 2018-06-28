package com.researchlib.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.researchlib.test.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
	
}
