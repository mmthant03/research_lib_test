package com.researchlib.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Login")
public class Login {
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "user_id")
	private Integer userid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", password=" + password + ", userid=" + userid + "]";
	}

	
}
