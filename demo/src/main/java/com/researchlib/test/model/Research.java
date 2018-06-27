package com.researchlib.test.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Research")
public class Research {

	@Column(name = "research_id")
	private Integer id;
	
	@Column(name = "research_name")
	private String name;
	
	@Column(name = "research_description")
	private String description;

	@Column(name = "research_file")
	private String file;
	
	@Column(name = "publish_date")
	private Date publishDate;
	
	@Column(name = "completion")
	private String completion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getCompletion() {
		return completion;
	}

	public void setCompletion(String completion) {
		this.completion = completion;
	}

	@Override
	public String toString() {
		return "Research [id=" + id + ", name=" + name + ", description=" + description + ", file=" + file
				+ ", publishDate=" + publishDate + ", completion=" + completion + "]";
	}
	
	
}
