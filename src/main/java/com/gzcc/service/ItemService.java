package com.gzcc.service;

import java.util.List;

import com.gzcc.pojo.Item;

public interface ItemService {

	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);

}
