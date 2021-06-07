package com.gzcc.service;

import com.gzcc.pojo.Order;

public interface OrderService {

	Order getOrder(String orderId);
	void addOrder(Order order);

}
