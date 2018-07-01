package com.researchlib.test.service;

import java.util.List;

import com.researchlib.test.dto.ResearchViewDto;
import com.researchlib.test.model.Research;

public interface ResearchService {
	
	List<Research> extractResearch();
	
	List<Research> searchResearches(String searchString);
	
	ResearchViewDto getResearch(Integer researchId);
}
