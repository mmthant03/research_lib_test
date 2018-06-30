package com.researchlib.test.dto;

import java.util.ArrayList;
import java.util.List;

import com.researchlib.test.model.Research;

public class HomeInfoDto {
	
	private String searchString;
	private List<Research> researches = new ArrayList()<>();

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public List<Research> getResearches() {
		return researches;
	}

	public void setResearches(List<Research> researches) {
		this.researches = researches;
	}

	@Override
	public String toString() {
		return "HomeInfoDto [searchString=" + searchString + ", researches=" + researches + "]";
	}
	
}
