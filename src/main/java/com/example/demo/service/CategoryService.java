package com.example.sales.service;

import java.util.List;

import com.example.sales.entity.Category;



public interface CategoryService {
	List<Category> findAll();
	
	Category findById(int id);
}
