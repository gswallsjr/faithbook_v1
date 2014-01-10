package com.faithbook.v1;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String serveWelcome(ModelMap map, Principal principal){
		
		String name = "";
		
		if (null != principal)
			name = principal.getName();
		else
			name = "Anonymous";
		
		
		map.addAttribute("message", "Welcome to the Future of Meetings");
		map.addAttribute("username", name);
		
		return "welcome";	
	}
	
	@RequestMapping(value="/pageNotFound", method = RequestMethod.GET)
	public String serve404(ModelMap map, Principal principal){
		
		return "404";	
	}

}
