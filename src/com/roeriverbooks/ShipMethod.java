package com.roeriverbooks;

public enum ShipMethod {
	SAME_DAY ("24 hours",0.20D),
	THREE_DAY ("72 hours",0.15D),
	GROUND ("5 days",0.05D);
	
	private final String description;
	private final double increment;
	
	ShipMethod(String description, double increment) {
		this.description = description;
		this.increment = increment;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getincrement() {
		return this.increment;
	}
}
