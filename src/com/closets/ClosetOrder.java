package com.closets;

import java.util.ArrayList;
import java.util.List;

public class ClosetOrder {

	private List<Order> orderList = new ArrayList<Order>();

	public void addItem(Order orders) {
		orderList.add(orders);
	}

	public void removeItem() {
		for (Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
