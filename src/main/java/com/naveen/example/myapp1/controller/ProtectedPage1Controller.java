package com.naveen.example.myapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sample/protected/page1")
public class ProtectedPage1Controller {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getProtectedPage1(Model model) {
		
		return "index";
	}

	
}
