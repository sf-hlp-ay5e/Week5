package com.roeriverbooks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.hamcrest.*;


public class BookOrderSystemTest {

	BookOrderSystem bookOrderSystem;
	BookOrderMock bookOrderMock;

	@Rule public ExpectedException thrown= ExpectedException.none();
	
	@Before
	public void setUp() throws Exception {
		bookOrderSystem = new BookOrderSystem();
		bookOrderMock = new BookOrderMock();
	}

	@Test
	public void testBookOrderSystemConstructor() {
		int expected = 0;
		assertEquals(expected,bookOrderSystem.getBookOrderList().size());
	}

	@Test
	public void testBookOrderMockConstructor() {
		int expected = 7;
		assertEquals(expected,bookOrderMock.getOrderList().size());
	}

	@Test
	public void testOrderBooks() {
		for (Book anOrder : bookOrderMock.getOrderList()) {
			try {
				bookOrderSystem.orderBook(anOrder);
			}
			catch (BookNotAvailableException cause) {
				System.out.println(cause.getMessage());
			}
		}
		int expected = 6;
		assertEquals(expected,bookOrderSystem.getBookOrderList().size());
	}

	@Test
	public void testrBookReport() {
		for (Book anOrder : bookOrderMock.getOrderList()) {
			try {
				bookOrderSystem.orderBook(anOrder);
			}
			catch (BookNotAvailableException cause) {
				System.out.println(cause.getMessage());
			}
		}
		String expected = "Book";
		String actual = bookOrderSystem.bookReport();
		assertTrue(actual.contains(expected));
	}
}
