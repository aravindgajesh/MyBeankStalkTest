package com.example.beanstalkdemo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.beanstalkdemo.resources.MyController;

@SpringBootTest
public class SmokeTest {
	
	@Autowired
	MyController myController;
	
	@Test
	void contextLoads() {
		assertThat(myController).isNotNull();
	}

	
}
