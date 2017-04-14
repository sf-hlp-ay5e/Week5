package com.roeriverbooks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SalesTaxMock implements SalesTaxService {
	
	private  static String[][] taxVals = {
		{"75087","8.25"},
		{"30080","6.00"},
		{"61761","8.75"},
		{"85001","8.60"}
	};

	private Map<String,Double> lookupTaxForZipCode;

	public SalesTaxMock() {
		super();
		Map<String,Double> lookupMap = new HashMap<>();
		for (String[] taxEntry : taxVals) {
			Double taxValue = Double.parseDouble(taxEntry[1]) / 100.0D; 
			lookupMap.put(taxEntry[0], taxValue);
//			System.out.printf("Tax loaded - zip:%-8s tax: %10.4f%n", taxEntry[0], taxValue);
		}
		this.lookupTaxForZipCode = lookupMap;
	}

	@Override
	public double lookup(String zipCode) {
		return lookupTaxForZipCode.get(zipCode);
	}

}
