package com.ciber.sprintteam.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingTest {

	@Test
	void createGreeting() {
		long greetingId = 12;
		String greetingContent = "hello";
		
		Greeting x = new Greeting(greetingId, greetingContent);
		
		assertEquals(greetingId, x.getId());
		assertEquals(greetingContent, x.getContent());
	}

}
