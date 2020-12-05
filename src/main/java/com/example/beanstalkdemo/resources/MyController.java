package com.example.beanstalkdemo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value = "/myHello", method = RequestMethod.GET)
	public String myHello() {
		System.out.println("ffff");;
		System.out.println("second ");;
		return "hello Aravind!";
		
	}

	@RequestMapping(value = "/myHello2", method = RequestMethod.GET)
	public String myHello2() {
		return "hello Aravind2!";
	}
}
