package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Transaction;
import com.example.demo.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping("/all")
	public List<Transaction> getAll(){
		return transactionService.findAll();
	}
	
	@GetMapping("/byid/{id}")
	public Transaction getOrderById(@PathVariable int id) {
		return transactionService.findById(id);
	}
}
