package com.researchlib.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.researchlib.test.model.Research;
import com.researchlib.test.model.ResearchResearcher;

public interface ResearchRepository extends JpaRepository<Research, Integer> {

}
