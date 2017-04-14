package com.roeriverbooks;

import com.roeriverbooks.SalesTaxMock;

	abstract class Book {
	private String isbn;
	private double basePrice;
	private String zipCode;

	// Constructors
	public Book(String isbn, double basePrice, String zipCode) {
		this.setIsbn(isbn);
		this.setBasePrice(basePrice);
		this.setZipCode(zipCode);
	}

	// Methods
	public abstract double calculateCost();

	public double calculateSalesTax() {
		SalesTaxService salesTaxService = new SalesTaxMock();
		return salesTaxService.lookup(this.getZipCode()) * basePrice;
	}
	
	@Override
	public String toString() {
		return "ISBN:" + this.getIsbn() + ", Price:" + this.getBasePrice() + ", ZipCOde:" + this.getZipCode(); 
	}

	// Setters and Getters
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
