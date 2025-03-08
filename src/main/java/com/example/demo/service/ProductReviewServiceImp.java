package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.ProductReview;
import com.example.demo.repository.ProductReviewRepository;
import java.util.List;
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
