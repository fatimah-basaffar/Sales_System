package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	List<Product> findAll();
	
	Product findById(int id);
}
