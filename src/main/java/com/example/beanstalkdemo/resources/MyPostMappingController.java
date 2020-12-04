package com.example.beanstalkdemo.resources;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPostMappingController {

	@PostMapping(value = "/post", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Hello myPostMethod(@RequestBody Hello hello) {
		return hello;
	}

	public static class Hello {
		private String name;
		private String greeting;

		public Hello() {

		}

		public Hello(String name, String greeting) {
			super();
			this.name = name;
			this.greeting = greeting;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGreeting() {
			return greeting;
		}

		public void setGreeting(String greeting) {
			this.greeting = greeting;
		}
	}
}
