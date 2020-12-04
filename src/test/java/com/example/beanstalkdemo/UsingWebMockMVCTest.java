package com.example.beanstalkdemo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class UsingWebMockMVCTest {

	@Autowired
	private MockMvc myMockMvc;

	@Test
	public void testOurController() throws Exception {

		this.myMockMvc.perform(get("/myHello")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("hello Aravind!")));
	}
	
	@Test
	public void testOurController2() throws Exception {

		this.myMockMvc.perform(get("/myHello")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("hello Aravinds!")));
	}
}
