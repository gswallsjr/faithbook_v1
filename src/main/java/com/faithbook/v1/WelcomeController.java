package com.faithbook.v1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String serveWelcome(ModelMap map){
		
		map.addAttribute("message", "Welcome to the Future of Meetings");
		return "welcome";
		
	}
	

}
