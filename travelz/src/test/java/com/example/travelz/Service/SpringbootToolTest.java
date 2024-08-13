package com.example.travelz.Service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootToolTest {
	
	@LocalServerPort
	private int port;
	
	private String url;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@BeforeEach
	public void setUp()
	{
		url = String.format("http://localhost:%d/",port);
	}
	
	@Test
	public void getString() {
		
		assertThat(this.restTemplate.getForObject(url+"getString", String.class)).contains("Travelz")
		;
	}

}
