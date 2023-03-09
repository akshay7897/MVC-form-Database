package com.ap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ap.entity.User;
import com.ap.repository.WelcomeRepo;

@EnableAutoConfiguration
@Controller
public class WelcomeController {
	
	@Autowired
	private WelcomeRepo repo;
	
	@GetMapping("/")
	public String getForm() {
		
		return "index";
	}
	
	@PostMapping("/user")
	public String formSubmit(User user,Model model) {
		System.out.println(user);
		repo.save(user);
		model.addAttribute("msg", "User Saved");
	
		return "index";
		
	}

}
