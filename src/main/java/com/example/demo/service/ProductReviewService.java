package com.example.sales.service;

import java.util.List;

import com.example.sales.entity.ProductReview;



public interface ProductReviewService {

List<ProductReview> findAll();
	
	ProductReview findById(int id);
}
