package com.researchlib.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.researchlib.test.model.Login;
import com.researchlib.test.repository.LoginRepository;

public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public Boolean authenticate(Integer id, String password) {

		boolean isAuthenticated = false;
		
		try {
			List<Login> user = loginRepository.findByLoginId(id);
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
	
	

}
