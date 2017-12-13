package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String test() {
		String str = restTemplate.getForObject("http://client/home", String.class);
		return str;
	}
	
}
