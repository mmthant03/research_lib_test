package com.researchlib.test.dto;

import java.util.ArrayList;
import java.util.List;

import com.researchlib.test.model.Research;

public class ResearchListDto {
	
	private List<Research> researches = new ArrayList<>();


	public List<Research> getResearches() {
		return researches;
	}

	public void setResearches(List<Research> researches) {
		this.researches = researches;
	}

	@Override
	public String toString() {
		return "ResearchListDto [researches=" + researches + "]";
	}

	
}
