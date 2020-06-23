package com.incubyte.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Demo extends EncryptionApplicationTests{
	
	
	@Test
	public void testOne() {
		TestEnryDecry test = new TestEnryDecry();
		assertEquals(test.encrypt("sam"),"h!b");
	}
	
	@Test
	public void testTwo() {
		TestEnryDecry test = new TestEnryDecry();
		assertEquals(test.encrypt("Manchester"),"h!b");
	}

}
