package com.researchlib.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.researchlib.test.dto.ResearchListDto;
import com.researchlib.test.dto.SearchInfoDto;
import com.researchlib.test.model.Research;
import com.researchlib.test.service.ResearchService;

@Controller
public class HomeController {
	
	@Autowired
	ResearchService researchService;
//
//	@RequestMapping(value = "/search", method = RequestMethod.Post)
//	pubilc String search(@ModelAttribute)
	
	@RequestMapping(value= "/search", method = {RequestMethod.POST, RequestMethod.GET})
	public String searchResult(@ModelAttribute SearchInfoDto searchInfo, Model model) {
		String searchString = searchInfo.getSearchString();
		
		List<Research> researches = researchService.searchResearches(searchString);
		
		model.addAttribute("researchList", researches);
		model.addAttribute("searchObject", new SearchInfoDto());
		
		return "SearchPage";
	}
	
}
