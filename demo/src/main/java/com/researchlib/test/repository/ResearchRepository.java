package com.researchlib.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.researchlib.test.model.Research;

public interface ResearchRepository extends JpaRepository<Research, Integer> {

}
