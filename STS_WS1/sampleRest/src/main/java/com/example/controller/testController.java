package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {
	
	@RequestMapping("test")
	public String test() {
		System.out.println("in java");
		return "test.jsp";

	}
}
