package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringBoot.SchedualServiceHi;

@RestController
public class TestController {

	@Autowired
    SchedualServiceHi schedualServiceHi;
	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
    public String sayHi(){
		return schedualServiceHi.sayHiFromClient();
    }
}
