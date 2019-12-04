package com.nagarro.kubernetes.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "service1")
public class Service1Controller {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@ResponseBody
	@GetMapping(value = "/hi")
	public String sayHi()
	{
		return "hi from Service 1";
	}
	
	@ResponseBody
	@GetMapping(value = "/call-dummy")
	public String callDummy()
	{
		String url = "http://localhost:8080/dummy";
        System.out.println("URL" + url);
        Map<String, String> params = new HashMap<>();
        String resp = restTemplate.getForObject(url, String.class, params);
		return resp;
	}

}
