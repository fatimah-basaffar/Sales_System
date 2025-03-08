package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.ProductReview;

@Repository
public interface ProductReviewRepository extends JpaRepository<ProductReview,Integer>{

}
