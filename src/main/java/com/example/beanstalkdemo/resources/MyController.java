package com.example.beanstalkdemo.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value = "/myHello", method = RequestMethod.GET)
	public String myHello() {
		return "hello Aravind!";
	}

}
