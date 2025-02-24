package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.OrderItem;
import com.example.demo.service.OrderItemService;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
	
	@Autowired
	private OrderItemService orderItemService;
	
	@GetMapping("/all")
	public List<OrderItem> getAll(){
		return orderItemService.findAll();
	}
	
	@GetMapping("/byid/{id}")
	public OrderItem getOrderById(@PathVariable int id) {
		return orderItemService.findById(id);
	}
}
