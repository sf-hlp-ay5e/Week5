package com.roeriverbooks;

import com.bobswarehouse.*;

public class Warehouse {
	BookLookUpService bobswarehouse;
	
	public Warehouse() {
		bobswarehouse = new BookLookUpService();
	}

	public int retrieveAvailableQuantity(Book book) {
		int available;
//		System.out.println("Warehouse lookup:" + book.getIsbn());
		available = bobswarehouse.lookup(book.getIsbn());
//		System.out.println("Bob says:" + available);
		return available;
	}
}
