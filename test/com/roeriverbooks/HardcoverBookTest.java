package com.roeriverbooks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HardcoverBookTest {
	
	HardcoverBook book;

	@Before
	public void setUp() throws Exception {
		book = new HardcoverBook("1234", 12.50D, "61761", ShipMethod.SAME_DAY);
	}

	@Test
	public void testHardcoverBook() {
		book = new HardcoverBook("1234", 12.50D, "61761", ShipMethod.SAME_DAY);
		assertTrue(book instanceof HardcoverBook);
		assertNotNull(book);
	}

	@Test
	public void testCalculateCost() {
		double expected = 16.09D;
		double actual = book.calculateCost();
		assertEquals(expected, actual, 0.01D);
	}

	@Test
	public void testToString() {
		String expected = "Ship Method:";
		String actual = book.toString();
		assertTrue(actual.contains(expected));
	}

}
