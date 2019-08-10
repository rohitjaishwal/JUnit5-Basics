package com.dev.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringConcatTest {

	StringConcat sc = new StringConcat();
	
	String actual = null;
	String expected = null;
	
	
	@Test
	void testAddTwoStr() {
		expected = "JUnit 5";
		actual = sc.addTwoStr("JUnit", " 5");
		System.out.println(actual);
		assertEquals(expected, actual);
	}

}
