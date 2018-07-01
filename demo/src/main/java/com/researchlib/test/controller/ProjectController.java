package com.researchlib.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProjectController {

	@RequestMapping(value = "/create", method = {RequestMethod.GET,RequestMethod.POST})
	public String createProject(Model model) {
		
		return "CreatePage";
	}
}
