package com.researchlib.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.researchlib.test.dto.ResearchViewDto;
import com.researchlib.test.dto.SearchInfoDto;
import com.researchlib.test.service.ResearchService;

@Controller
public class ResearchViewController {
	
	@Autowired
	ResearchService researchService;
	
	@RequestMapping(value = "/research/{research_id}", method = {RequestMethod.POST,RequestMethod.GET})
	public String researchView(@PathVariable("research_id") Integer research_Id, Model model) {
		ResearchViewDto researchView = researchService.getResearch(research_Id);
		
		model.addAttribute("searchObject", new SearchInfoDto());
		model.addAttribute("researchView", researchView);
		return "ResearchPage";
	}

}
