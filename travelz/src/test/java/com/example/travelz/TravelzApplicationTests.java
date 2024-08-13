package com.example.travelz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TravelzApplicationTest{
	
	@DisplayName("Test TravelzApplication.test()")
	@Test
	void test() {
		assertEquals("Start", "Start");
	}

}
