package com.hcl.project13.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserWelcomeController {

	@RequestMapping(value="UserWelcome", method=RequestMethod.GET)
	public String UserWelcome() {
		return "UserWelcome";
	}
}
