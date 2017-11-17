package com.spring;

import org.springframework.stereotype.Component;

import com.spring.SpringBoot.SchedualServiceHi;

public class HystricController {
    
    @Component
    public class SchedualServiceHiHystric implements SchedualServiceHi {
	    
    @Override
    public String sayHiFromClient() {
    	return "sorry";
    }	
    
    }
}
