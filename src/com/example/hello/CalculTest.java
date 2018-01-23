package com.example.hello;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculTest {

	Calcul calcul = new Calcul();

	@Test
	void testMultiplier() {
		int expected = 15;
		int actual = calcul.multiplier(3, 5);
		String message = "Expected : " + expected + ", Actual : " + actual;
		assertEquals(expected, actual, message);
	}

	@Test
	void testAdditioner() {
		assertEquals(10, calcul.additioner(5, 5), "Expected: 10");
	}

	@Test
	void testSoustraire() {
		assertEquals(5, calcul.soustraire(10, 5));
	}

}
