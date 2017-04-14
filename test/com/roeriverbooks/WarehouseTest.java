package com.roeriverbooks;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WarehouseTest {
	Warehouse warehouse;

	@Before
	public void setUp() throws Exception {
		warehouse = new Warehouse();
	}

	@Test
	public void testWarehouse() {
		Warehouse warehouse = new Warehouse();
		assertTrue(warehouse instanceof Warehouse);
		assertNotNull(warehouse);
	}

	@Test
	public void testRetrieveAvailableQuantity() {
		Book book = new DownloadableBook("2345", 10.00D, "75087");
		int expected = 1;
		int actual = warehouse.retrieveAvailableQuantity(book);
		assertEquals(expected, actual);
	}

}
