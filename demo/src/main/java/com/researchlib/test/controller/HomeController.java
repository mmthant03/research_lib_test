package com.researchlib.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.researchlib.test.dto.HomeInfoDto;

@Controller
public class HomeController {
//
//	@RequestMapping(value = "/search", method = RequestMethod.Post)
//	pubilc String search(@ModelAttribute)
	
	@RequestMapping(value= "/search", method = RequestMethod.POST)
	public String searchResult(@ModelAttribute HomeInfoDto homeInfo, Model model) {
		String searchString = homeInfo.getSearchString();
		
		model.addAttribute("researches", homeInfo.getResearches());
		
		return null;
	}
	
}
