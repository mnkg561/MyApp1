package com.naveen.example.myapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MFAEnabledPageController {

	@RequestMapping(value="/sample/mfa/page", method=RequestMethod.GET)
	public String mfaPage(){
		return "index";
	}
}
