package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.ProductReview;

public interface ProductReviewService {
	
	List<ProductReview> findAll();
	
	ProductReview findById(int id);
}
