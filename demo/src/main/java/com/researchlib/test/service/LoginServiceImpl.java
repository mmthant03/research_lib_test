package com.researchlib.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.researchlib.test.model.Login;
import com.researchlib.test.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public Boolean authenticate(String username, String password) {

		boolean isAuthenticated = false;
		
		try {
			List<Login> user = loginRepository.findByUsername(username);
			if(user.get(0).getPassword().equals(password)) {
				isAuthenticated = true;
			} else {
				isAuthenticated = false;
			}
		} 
		catch (NullPointerException e) {
			isAuthenticated = false;
		} 
		
		return isAuthenticated;
	}

	@Override
	public String register(String username, String password) {
		Login newUser = new Login();
		newUser.setUsername(username);
		newUser.setPassword(password);
		
		boolean isExist = false;
		
		try {
			List<Login> user = loginRepository.findByUsername(username);
			if(!user.isEmpty()) {
				isExist = true;
			} else {
				isExist = false;
			}
		} 
		catch (NullPointerException e) {
			isExist = false;
		}
		
		if(!isExist) {
			loginRepository.save(newUser);
			return "You are successfully registered.";
		}
		else {
			return "Your account already exist! Please try again.";
		}
		
	}
	
	

}
