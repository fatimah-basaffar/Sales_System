package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImp implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order findById(int id) {
		return orderRepository.findById(id).orElse(null);
	}
	
}
