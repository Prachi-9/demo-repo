package com.example.sampleRest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sampleRest.dao.loginDao;
import com.example.sampleRest.dto.loginDto;
import com.fasterxml.jackson.databind.JsonMappingException;

import net.minidev.json.JSONObject;

@RestController
public class loginController {

	@Autowired
	loginDao repo;
	
	@RequestMapping(value="/doLogin", method=RequestMethod.POST)
	@ResponseBody
	public JSONObject doLogin(@RequestBody loginDto login) {
		
		JSONObject jsonObject = new JSONObject();
		System.out.println("in java");
		Optional<loginDto> l = repo.findById(login.getLoginId());
		if(l.isPresent()) {
			if(l.get().getPass().equals(login.getPass())) {
				jsonObject.put("data", "SUCCESS");
			}else {
				jsonObject.put("data", "FAIL");
			}
		}else {
			jsonObject.put("data", "FAIL");
		}
		
		return jsonObject;
	}
}
