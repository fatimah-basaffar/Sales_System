package com.example.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sales.entity.ProductReview;
import com.example.sales.service.ProductReviewService;



@RestController
@RequestMapping("product_review")
public class ProductReviewController {

	 @Autowired
	 private ProductReviewService productReviewService;

	    @GetMapping("/all")
	    public List<ProductReview> getAllProductReviews() {
	        return productReviewService.findAll();
	    }

	    @GetMapping("/byid/{id}")
	    public ProductReview getProductReviewById(@PathVariable int id) {
	        return productReviewService.findById(id);
	    }
}
