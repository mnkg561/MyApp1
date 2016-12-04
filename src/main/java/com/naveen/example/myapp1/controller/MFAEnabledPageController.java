package com.naveen.example.myapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MFAEnabledPageController {
	
	//final static Logger logger = Logger.getLogger(MFAEnabledPageController.class);
	@RequestMapping(value="/sample/mfa/page", method=RequestMethod.GET)
	public String mfaPage(){
		System.out.println("Inside MFA Enabled Page");
		return "index";
	}
}
