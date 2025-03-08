package com.example.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sales.entity.Category;
import com.example.sales.repository.CategoryRepository;



@Service
public class CategoryServiceImp implements CategoryService{
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(int id) {
		return categoryRepository.findById(id).orElse(null);
	}
}
