package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigServer
public class SpringBoot {
	
	@RequestMapping("/home")
	public String home() {
		return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }
}
