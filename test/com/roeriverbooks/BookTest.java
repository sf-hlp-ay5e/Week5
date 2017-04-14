package com.roeriverbooks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	
	Book hardBook;
	Book downloadableBook;

	@Before
	public void setUp() throws Exception {
		hardBook = new HardcoverBook("2388",20.00D,"75087",ShipMethod.GROUND);
		downloadableBook = new DownloadableBook("1399",15.00D,"30080");
	}

	@Test
	public void testGoodBook() {
		Book newHardBook = new HardcoverBook("2345",20.00D,"61761",ShipMethod.THREE_DAY);
		assertNotNull(newHardBook);
	}

	@Test
	public void testCalculateCost() {
		double actual = hardBook.calculateCost();
		double expected = 22.65D;
		assertEquals(expected,actual,0.001D);
	}

	@Test
	public void testCalculateSalesTax() {
		double actual = hardBook.calculateSalesTax();
		double expected = 1.65D;
		assertEquals(expected,actual,0.001D);
	}

	@Test
	public void testToString() {
		String actual = hardBook.toString();
		String expected = "ISBN:";
		assertTrue(actual.startsWith(expected));
	}

	@Test
	public void testGetIsbn() {
		String actual = hardBook.getIsbn();
		String expected = "2388";
		assertEquals(actual,expected);
	}

	@Test
	public void testSetIsbn() {
		String expected = "7777";
		hardBook.setIsbn(expected);
		String actual = hardBook.getIsbn();
		assertEquals(actual,expected);
	}

	@Test
	public void testGetBasePrice() {
		double actual = hardBook.getBasePrice();
		double expected = 20.00D;
		assertEquals(expected,actual,0.001D);
	}

	@Test
	public void testSetBasePrice() {
		double expected = 25.00D;
		hardBook.setBasePrice(expected);
		double actual = hardBook.getBasePrice();
		assertEquals(expected,actual,0.001D);
	}

	@Test
	public void testGetZipCode() {
		String expected = "75087";
		String actual = hardBook.getZipCode();
		assertEquals(actual,expected);
	}

	@Test
	public void testSetZipCode() {
		String expected = "45879";
		hardBook.setZipCode(expected);
		String actual = hardBook.getZipCode();
		assertEquals(actual,expected);
	}

}
