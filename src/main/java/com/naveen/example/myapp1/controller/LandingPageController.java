package com.naveen.example.myapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LandingPageController {
	//final static Logger logger = Logger.getLogger(LandingPageController.class);
	@RequestMapping(value="/landing/page", method=RequestMethod.GET)
	public String getLandingPage(){
		//System.out.println("Inside Unprotected Page");
		return "unProtectedPage";
	}

}
