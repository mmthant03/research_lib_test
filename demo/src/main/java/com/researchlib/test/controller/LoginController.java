package com.researchlib.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.researchlib.test.dto.LoginInfoDto;
import com.researchlib.test.repository.ResearchRepository;
import com.researchlib.test.dto.ResearchListDto;
import com.researchlib.test.dto.SearchInfoDto;
import com.researchlib.test.service.LoginService;
import com.researchlib.test.service.ResearchService;


@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	ResearchService researchService;
	
	@Autowired
	ResearchRepository researchRepository;

	@RequestMapping(value = "/")
	public String homePage(Model model) {
		model.addAttribute("userInfo", new LoginInfoDto());
		return "LoginPage";
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
		model.addAttribute("isexist", isAuthenticated);
		
		if(isAuthenticated) {
			ResearchListDto researchList = new ResearchListDto();
			SearchInfoDto searchObject = new SearchInfoDto();
			researchList.setResearches(researchService.extractResearch());
			model.addAttribute("researchList", researchList.getResearches());
			model.addAttribute("searchObject", searchObject);
			return "HomePage";
		} else {
			return "error";
		}
		
	}
	
	@RequestMapping(value= "/register", method = {RequestMethod.GET, RequestMethod.POST})
	public String register() {
		return "Register";
	}
}
