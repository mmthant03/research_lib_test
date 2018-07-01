package com.researchlib.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "researchprofessor")
public class ResearchProfessor {
	
	@Id
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "research_id")
	private Integer researchId;
	
	@Column(name = "professor_id")
	private Integer professorId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getResearchId() {
		return researchId;
	}

	public void setResearchId(Integer researchId) {
		this.researchId = researchId;
	}

	public Integer getProfessorId() {
		return professorId;
	}

	public void setProfessorId(Integer professorId) {
		this.professorId = professorId;
	}

	@Override
	public String toString() {
		return "ResearchProfessor [id=" + id + ", researchId=" + researchId + ", professorId=" + professorId + "]";
	}

	
}
