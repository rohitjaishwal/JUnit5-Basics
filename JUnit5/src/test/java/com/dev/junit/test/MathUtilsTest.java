package com.dev.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

	MathUtils mu = new MathUtils();
	int expected = 0;
	int actual = 0;

	@BeforeAll
	static void display() {
		System.out.println("Before All");
	}

	@AfterEach
	 void display2() {
		System.out.println("After each");
	}

	@Test
	@Disabled
	void test1() {

		expected = 5;
		actual = mu.add(2, 3);
		assertEquals(expected, actual);
		System.out.println(actual);
	}

	@Test
	void test2() {
		expected = 3;
		actual = mu.sub(5, 2);
		assertEquals(expected, actual);
		System.out.println(actual);
	}

	@Test
	void test3() {
		expected = 10;
		actual = mu.mul(5, 2);
		assertEquals(expected, actual);
		System.out.println(actual);
	}

	@Test
	void test4() {
		double expected = 2.5;
		double actual = mu.div(5, 2);
		assertEquals(expected, actual);
		System.out.println(actual);
	}

	@Test
	void test5() {
		expected = 15;
		actual = mu.add(5, 5, 5);
		assertEquals(expected, actual);
		System.out.println(actual);
	}
}
