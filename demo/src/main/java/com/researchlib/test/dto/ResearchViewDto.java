package com.researchlib.test.dto;

import java.util.List;

public class ResearchViewDto {
	
	private String researchName;
	
	private List<String> professorNames;
	
	private List<String> studentNames;
	
	private String researchFile;
	
	private String description;

	public String getResearchName() {
		return researchName;
	}

	public void setResearchName(String researchName) {
		this.researchName = researchName;
	}

	public List<String> getProfessorNames() {
		return professorNames;
	}

	public void setProfessorNames(List<String> professorNames) {
		this.professorNames = professorNames;
	}

	public List<String> getStudentNames() {
		return studentNames;
	}

	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}

	public String getResearchFile() {
		return researchFile;
	}

	public void setResearchFile(String researchFile) {
		this.researchFile = researchFile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ResearchViewDto [researchName=" + researchName + ", professorNames=" + professorNames
				+ ", studentNames=" + studentNames + ", researchFile=" + researchFile + ", description=" + description
				+ "]";
	}

	
	
}
