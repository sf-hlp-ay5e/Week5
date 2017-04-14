package com.roeriverbooks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DownloadableBookTest {
	
	DownloadableBook book;

	@Before
	public void setUp() throws Exception {
		book = new DownloadableBook("1234", 12.50D, "61761");
	}

	@Test
	public void testDownloadableBook() {
		book = new DownloadableBook("1234", 12.50D, "61761");
		assertTrue(book instanceof DownloadableBook);
		assertNotNull(book);
	}

	@Test
	public void testCalculateCost() {
		double expected = 13.59D;
		double actual = book.calculateCost();
		assertEquals(expected, actual, 0.01D);
	}

}
