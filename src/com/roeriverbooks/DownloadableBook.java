package com.roeriverbooks;

class DownloadableBook extends Book {

	public DownloadableBook(String isbn, double basePrice, String zipCode) {
		super(isbn, basePrice, zipCode);
	}

	@Override
	public double calculateCost() {
		double basePrice = getBasePrice();
		double salesTax = calculateSalesTax();
		double total = basePrice + salesTax;
//		System.out.printf("base:%10.2f  tax:%10.2f  Total:%10.2f%n",basePrice, salesTax, total);
		return basePrice + salesTax;
	}

}
