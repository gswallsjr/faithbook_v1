package com.faithbook.v1;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal) {
		
		String name = "";
		
		if (null != principal)
			name = principal.getName();
		else
			name = "Anonymous";
		
		model.addAttribute("username", name);
		model.addAttribute("message", "Spring Security Custom Form example");
		return "hello";
		}
	
	@RequestMapping(value="loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "login";
	}
	
	@RequestMapping(value="logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		return "login";
	}
}