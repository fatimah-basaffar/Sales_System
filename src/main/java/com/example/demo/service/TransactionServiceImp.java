package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Transaction;
import com.example.demo.repository.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImp implements TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public List<Transaction> findAll() {
		return transactionRepository.findAll();
	}

	@Override
	public Transaction findById(int id) {
		return transactionRepository.findById(id).orElse(null);
	}
	
}
