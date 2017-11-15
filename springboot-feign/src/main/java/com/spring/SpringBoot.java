package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients
public class SpringBoot {
	
	@RequestMapping("/home")
    public String home() {
		return "Hello World,I am fegin";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }
     
    @FeignClient(value = "client")
    public interface SchedualServiceHi {
        @RequestMapping(value = "/home", method = RequestMethod.GET)
        String sayHiFromClient();
    }
}
