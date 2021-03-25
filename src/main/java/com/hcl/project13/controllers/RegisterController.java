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
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String home() {
		return "register";
	}
	
	@RequestMapping(value="registerNewUser", method=RequestMethod.POST)
	public String registerPage(@RequestParam String username, String email ,String password, String confirmPassword, HttpSession session) {

		if (!password.equals(confirmPassword)) {
			session.setAttribute("errorMessage", "Error: passwords do not match");
			return "error";
		}
		else {
			User user = new User();
			user.setName(username);
			user.setEmail(email);
			user.setPassword(password);
			
			user = userService.CreateUser(user);
			
			session.setAttribute("User", user);
			
			return "userWelcome";
		}
		
	}
	
	
}
