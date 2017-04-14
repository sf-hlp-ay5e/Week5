package com.roeriverbooks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalesTaxServiceTest {
	
	SalesTaxService salesTaxService;

	@Before
	public void setUp() throws Exception {
		salesTaxService = new SalesTaxMock();
	}

	@Test
	public void testLookup() {
		double expected = 0.0875D;
		double actual = salesTaxService.lookup("61761");
		assertEquals(expected, actual, 0.0001);
	}

}
