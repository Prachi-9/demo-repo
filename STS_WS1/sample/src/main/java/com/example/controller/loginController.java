package com.example.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginController {

	
	@RequestMapping("/doLogin")
	public String doLogin(HttpServletRequest res) {
		/*
		 * if(pass.equalsIgnoreCase("123")) return "Success";
		 */
		System.out.println("in java");
		return "fail";

	}
}
