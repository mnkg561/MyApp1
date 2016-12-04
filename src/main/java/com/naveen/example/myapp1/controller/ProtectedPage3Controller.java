package com.naveen.example.myapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sample/protected/page3")
public class ProtectedPage3Controller {
	//final static Logger logger = Logger.getLogger(ProtectedPage3Controller.class);
	@RequestMapping(method = RequestMethod.GET)
	public String getProtected3Page(Model model) {
		System.out.println("Inside protected page3 controller");
		return "index";
	}
}
