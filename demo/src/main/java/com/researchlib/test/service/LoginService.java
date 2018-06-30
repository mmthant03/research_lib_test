package com.researchlib.test.service;

public interface LoginService {
	
	Boolean authenticate(String username, String password);
	String register(String username, String password);
}
