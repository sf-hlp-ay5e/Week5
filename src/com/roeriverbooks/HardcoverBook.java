package com.roeriverbooks;

class HardcoverBook extends Book {
	
	private ShipMethod shipMethod;

	public HardcoverBook(String isbn, double basePrice, String zipCode, ShipMethod shipMethod) {
		super(isbn, basePrice, zipCode);
		this.shipMethod = shipMethod;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Ship Method:" + this.shipMethod;
	}

	@Override
	public double calculateCost() {
		double basePrice = getBasePrice();
		double increment = shipMethod.getincrement() * basePrice;
//		System.out.printf("Ship Metohd (" + shipMethod.toString() + ") Increment: %10.2f%n", shipMethod.getincrement());
		double salesTax = calculateSalesTax();
		double total = basePrice + increment + salesTax;
		String shippedBy = shipMethod.toString();
//		System.out.printf("base:%10.2f  increment:%10.2f (" + shippedBy + ") tax:%10.2f Total:%10.2f%n", basePrice, increment, salesTax, total);
		return (basePrice + increment + salesTax);
	}
	
}
