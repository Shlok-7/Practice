package com.shlok.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shlok.demo.entity.LoginPage;


@Controller
public class MyController {
	
	
	@GetMapping("/hello")
	public String hello() {
		String fileName="NotBraining";
		return fileName;
		
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		// Create the object of the LoginPage which is the entity/pojo class and gives to view/jsp file
		//for the jsp to fill the data in the object based on what the user has entered in the form.
		model.addAttribute("LoginPage" , new LoginPage());
		return "login";
	}
	
	@PostMapping("/login")
	public String login(Model model , @ModelAttribute("LoginPage") LoginPage LoginPage) {
		if(LoginPage.getUID().equals("Admin") && LoginPage.getPWD().equals("Admin")) {
			return "loginSuccess";
		}
		else {
			model.addAttribute("LoginPage" , new LoginPage());
			return "loginFailure";
		}
	}
	

}
