package com.example.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sales.entity.Category;
import com.example.sales.entity.OrderItem;
import com.example.sales.entity.ProductCategory;
import com.example.sales.entity.ProductCategoryEmbeddable;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,ProductCategoryEmbeddable>{

}
