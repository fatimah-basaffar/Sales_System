package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Transaction;

public interface TransactionService {
	List<Transaction> findAll();
	
	Transaction findById(int id);
}
