package com.example.sales.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.example.sales.entity.ProductReview;
import com.example.sales.repository.ProductReviewRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductReviewServiceImp implements ProductReviewService{
	@Autowired
	private ProductReviewRepository productReviewRepository;
	
	@Override
	public List<ProductReview> findAll() {
		return productReviewRepository.findAll();
	}

	@Override
	public ProductReview findById(int id) {
		return productReviewRepository.findById(id).orElse(null);
	}
}
