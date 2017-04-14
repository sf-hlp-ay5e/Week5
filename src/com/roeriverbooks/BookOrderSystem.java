package com.roeriverbooks;

import java.util.ArrayList;
import java.util.List;

class BookOrderSystem {
	
	private List<Book> bookOrderList;
	private Warehouse warehouse;
	private double totalCost = 0D;

	public BookOrderSystem() {
		this.bookOrderList = new ArrayList<Book>();
		this.warehouse = new Warehouse();
	}

	public void orderBook(Book order) throws BookNotAvailableException {
		if ((order instanceof HardcoverBook)  && (warehouse.retrieveAvailableQuantity(order) < 1)) {
			throw new BookNotAvailableException("Hardcover book with isbn: " + order.getIsbn() + " is not available in the Warehouse");
		} else {
			totalCost += order.calculateCost();
			this.bookOrderList.add(order);
		}
	}
	public String bookReport() {
		String report = "";
		String format = "%10.2f %-60s%n";
		String titleLine     = "      Cost Book Orders Processes:\n";
		String separatorLine = "---------- ------------------------------------------------------------\n";
		
		report += titleLine;
		report += separatorLine;
		for (Book book : getBookOrderList()) {
			report += String.format(format, book.calculateCost(), book.toString());
		}
		report += separatorLine;
		report += String.format(format,getTotalCost(),"TotalCost");

		System.out.print(report);
		
		return report;
	}

	// Setters and Getters
	public List<Book> getBookOrderList() {
		return this.bookOrderList;
	}

	public double getTotalCost() {
		return totalCost;
	}
}
