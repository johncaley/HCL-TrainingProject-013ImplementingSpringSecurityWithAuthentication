package com.hcl.project13.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.project13.entities.User;
import com.hcl.project13.services.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String home() {
		return "login";
	}
	
	@RequestMapping(value="LoginToServer", method=RequestMethod.POST)
	public String loginPage(@RequestParam String username, String password, HttpSession session) {
		
		User user = userService.GetUserByName(username);
		
		if (!user.getPassword().equals(password))
		{
			session.setAttribute("errorMessage", "Error: Username or Password is invalid");
			return "error";
		}
		else {
			session.setAttribute("User", user);
			return "userWelcome";
		}
	}
}
