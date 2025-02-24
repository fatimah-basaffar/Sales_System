package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.OrderItem;
import com.example.demo.repository.OrderItemRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemServiceImp implements OrderItemService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Override
	public List<OrderItem> findAll() {
		return orderItemRepository.findAll();
	}

	@Override
	public OrderItem findById(int id) {
		return orderItemRepository.findById(id).orElse(null);
	}
	
}
