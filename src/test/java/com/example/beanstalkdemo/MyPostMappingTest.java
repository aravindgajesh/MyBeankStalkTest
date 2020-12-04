package com.example.beanstalkdemo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.beanstalkdemo.resources.MyPostMappingController;

@WebMvcTest(MyPostMappingController.class) // if we dont define the class here, we will fail with a different controller
											// class call
public class MyPostMappingTest {

	@Autowired
	private MockMvc myMockMvc;

	@Test
	public void testPost() throws Exception {
		String json = "{\"name\":\"aravind\", \"greeting\":\"Hello\"}";
		this.myMockMvc.perform(post("/post").contentType(MediaType.APPLICATION_JSON).content(json)).andDo(print())
				.andExpect(status().isOk()).andExpect(jsonPath("$.name", Matchers.is("aravind")))
				.andExpect(jsonPath("$.greeting", Matchers.is("Hello")))
				.andExpect(jsonPath("$.*", Matchers.hasSize(2)));
	}

}
