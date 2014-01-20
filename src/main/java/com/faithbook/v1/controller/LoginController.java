package com.faithbook.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="/public/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		return "/public/login";
	}
	
	@RequestMapping(value="/public/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model){
		model.addAttribute("error", "true");
		return "/public/login";
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model){
		return "/public/login";
	}

}
