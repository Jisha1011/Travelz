package com.example.travelz.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.containsString;


@SpringBootTest
@AutoConfigureMockMvc
public class GeneralTests {
	@Autowired
	private MockMvc mockMvc;
	
	@DisplayName("GeneralSet test")
	@Test
	public void test() throws Exception
	{
		
		this.mockMvc.perform(get("/getString"))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(content().string(containsString("Travelz")));
	
	}
}
