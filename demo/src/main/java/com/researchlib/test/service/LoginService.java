package com.researchlib.test.service;

import java.util.List;

import com.researchlib.test.model.Login;

public interface LoginService {
	
	Boolean authenticate(String username, String password);
	String register(String username, String password);
	List<Login> retrieveData();
}
