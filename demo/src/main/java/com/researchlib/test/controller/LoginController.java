package com.researchlib.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.researchlib.test.dto.LoginInfoDto;
import com.researchlib.test.dto.HomeInfoDto;
import com.researchlib.test.service.LoginService;
import com.researchlib.test.service.ResearchService;

@RequestMapping("")
@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	ResearchService researchService;

	@PostMapping
	public String homePage(Model model) {
		model.addAttribute("userInfo", new LoginInfoDto());
		return "login";
	}
	
//	@RequestMapping(value="/register", method = RequestMethod.POST)
//	public String register(Model model) {
//		model.addAttribute("userInfo", new LoginInfoDto());
//		
//	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute LoginInfoDto loginInfo, Model model) {
		String username = loginInfo.getUsername();
		String password = loginInfo.getPassword();
		
		boolean isAuthenticated = loginService.authenticate(username, password);
		
		
		if(isAuthenticated) {
			HomeInfoDto searchInfoString = new HomeInfoDto();
			searchInfoString.setResearches(researchService.extractResearch());
			model.addAttribute("searchString", searchInfoString);
			return "home";
		} else {
			return "error";
		}
		
	}
}
