package com.kubernetesTest.serviceB.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyRestService {

	@ResponseBody
	@RequestMapping(value = "/dummy", method = RequestMethod.GET)
	public String getDummy() {
		return "dummy";
	}
}
