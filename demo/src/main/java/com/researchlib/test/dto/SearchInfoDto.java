package com.researchlib.test.dto;

public class SearchInfoDto {
	private String searchString;

	public String getSearchString() {
		return searchString;
	}

	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	@Override
	public String toString() {
		return "SearchInfoDto [searchString=" + searchString + "]";
	}
	
	
}
