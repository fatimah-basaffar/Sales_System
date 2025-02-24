package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OrderItem;

public interface OrderItemService {
	List<OrderItem> findAll();
	
	OrderItem findById(int id);
}
