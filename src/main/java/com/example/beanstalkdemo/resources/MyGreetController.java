package com.example.beanstalkdemo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Services.MyGreetService;

@RestController
public class MyGreetController {
	
	@Autowired
	MyGreetService myGreetService;
	
	@RequestMapping(value = "/myHello", method = RequestMethod.GET)
	public String myHello() {
		return myGreetService.myGreet();
	}

}
