package com.springmvc.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CollegeController {

	@ResponseBody
	@RequestMapping("/")
	public String getName(Model model) {
		
//		String name = "The University of Texas at Arlington";
//		model.addAttribute("collegename", name);
//		
//		model.addAttribute("address", "Cooper Street");
		
		return "index";
	}
	
	@RequestMapping("/profile")
	public String myProfile(HttpServletRequest requestReceived, Model model) {
		
		String profileName = requestReceived.getParameter("profile-name");
		model.addAttribute("myname", profileName);
		
		return "profilePage";
	}
		
	
}
