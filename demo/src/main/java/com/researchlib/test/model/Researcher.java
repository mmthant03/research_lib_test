package com.researchlib.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Researcher")
public class Researcher {
	
	@Id
	@Column(name = "researcher_id")
	private Integer id;
	
	@Column(name = "researcher_name")
	private String name; 
	
	@Column(name = "researcher_address")
	private String address;
	
	@Column(name = "phone_no")
	private Integer phoneNo;
	
	@Column(name = "email_address")
	private String email;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Researcher [id=" + id + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", email="
				+ email + "]";
	}
	
	
	
}
