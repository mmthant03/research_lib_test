package com.researchlib.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.researchlib.test.model.Researcher;

public interface ResearcherRepository extends JpaRepository<Researcher, Integer> {

}
