package com.naveen.example.myapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sample/protected/marketing/page")
public class MarketingController {
	@RequestMapping(method = RequestMethod.GET)
	public String displayMarketingPage(Model model, @CookieValue(value = "userId", defaultValue = "") String userId) {
		model.addAttribute("userId", userId);
		return "marketingPage";
	}
}
