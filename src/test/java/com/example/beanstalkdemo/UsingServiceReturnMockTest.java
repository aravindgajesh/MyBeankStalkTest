package com.example.beanstalkdemo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.beanstalkdemo.resources.MyGreetController;

import Services.MyGreetService;

@WebMvcTest(MyGreetController.class)
public class UsingServiceReturnMockTest {

	

	@Autowired
	private MockMvc myMockMvc;
	
	@MockBean
	MyGreetService myGreetService;

	@Test
	public void testOurController() throws Exception {
		
		when(myGreetService.myGreet()).thenReturn("lets mock");

		this.myMockMvc.perform(get("/myHello")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("lets mock")));
	}
}
