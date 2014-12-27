package com.nogoodbay.examples.junitmavenexaple;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalucateTest {
	private static ICalculator calculator;
	
	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("Before Test!");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("After Test!");
	}
	
	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);
		
		assertEquals(7, result);
	}
	
	@Test
	public void testDivison() {
		try {
			int result = calculator.devison(10, 2);
			
			assertEquals(5, result);
		} catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	@Test(expected = Exception.class)
	public void testDivisonException() throws Exception {
		calculator.devison(10, 0);
	}
	
	@Ignore
	@Test
	public void testEqualFalse() {
		boolean result = calculator.equalIntegers(10, 2);
		
		assertFalse(result);
	}
	
	@Ignore
	@Test
	public void testEqualTrue() {
		boolean result = calculator.equalIntegers(10, 10);
		
		assertTrue(result);
	}
	
	@Ignore
	@Test
	public void testSubstraction() {
		int result = calculator.subtraction(10, 2);
		
		assertEquals(8, result);
	}
}