package com.naveen.example.myapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/sample/protected/allemployees/page")
public class AllEmployeesController {
	@RequestMapping(method=RequestMethod.GET)
	public String displayAllEmployeesPage(Model model, @CookieValue(value="userId", defaultValue="") String userId){
		model.addAttribute("userId", userId);
		return "allEmployeesPage";
	}

}
