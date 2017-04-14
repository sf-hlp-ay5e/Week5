package com.roeriverbooks;

import java.util.ArrayList;
import java.util.List;

class BookOrderMock {
	private  static String[][] orderVals = {
		{"2345","10.00","75087",""},
		{"2388","20.00","75087","GROUND"},
		{"1399","15.00","30080",""},
		{"2222","12.00","85001",""},
		{"1995","10.00","30080","SAME_DAY"},
		{"2345","20.00","61761","THREE_DAY"},
		{"2337","15.00","30080","SAME_DAY"}
	};
	private List<Book> orderList;
	
	public BookOrderMock(){
		this.orderList = new ArrayList<Book>();
		Book aBook;
		for (String[] order : orderVals) {
			if (order[3].equals("")) {
				aBook = new DownloadableBook(order[0], Double.parseDouble(order[1]), order[2]);
			} else {
				aBook = new HardcoverBook(order[0], Double.parseDouble(order[1]), order[2], ShipMethod.valueOf(order[3]));
			}
			orderList.add(aBook);
		}
	}
	
	public List<Book> getOrderList() {
		return this.orderList;
	}
}
