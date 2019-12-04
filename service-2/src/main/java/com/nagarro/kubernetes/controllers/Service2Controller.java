package com.nagarro.kubernetes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

	
	@ResponseBody
	@GetMapping(value = "/dummy")
	public String sayHi()
	{
		return "hi from Service 2";
	}
}
