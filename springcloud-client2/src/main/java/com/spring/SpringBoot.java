package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class SpringBoot {
	
    @RequestMapping("/home")
    public String home() {
        return "Hello World,I am from client2";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }
}
