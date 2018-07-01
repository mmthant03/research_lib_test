//package com.researchlib.test.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import com.researchlib.test.dto.ResearchListDto;
//import com.researchlib.test.dto.SearchInfoDto;
//import com.researchlib.test.model.Research;
//import com.researchlib.test.service.ResearchService;
//
//@Controller
//public class SearchController {
//	
//	@Autowired
//	ResearchService researchService;
//
//	@RequestMapping(value="/search", method = RequestMethod.POST)
//	public String searchResult(@RequestParam("searchString") String searchString, @ModelAttribute SearchInfoDto searchObject, Model model) {
//		String search = searchObject.getSearchString();
//		List<Research> researchList = researchService.searchResearches(searchString);
//		
//		model.addAttribute("researchList", researchList);
//		model.addAttribute("searchObject", search);
//		return "home";
//	}
//	
//}
