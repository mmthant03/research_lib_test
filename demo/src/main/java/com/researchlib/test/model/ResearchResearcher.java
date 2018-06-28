package com.researchlib.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Research_Researcher")
public class ResearchResearcher {
	
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "research_id")
	private Integer researchId;
	
	@Column(name = "researcher_id")
	private Integer researcherId;
	
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

	public Integer getResearcherId() {
		return researcherId;
	}

	public void setResearcherId(Integer researcherId) {
		this.researcherId = researcherId;
	}

	@Override
	public String toString() {
		return "ResearchResearcher [id=" + id + ", researchId=" + researchId + ", researcherId=" + researcherId + "]";
	}

	
}
