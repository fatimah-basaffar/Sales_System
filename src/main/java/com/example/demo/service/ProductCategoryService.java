package com.example.sales.service;

import java.util.List;

import com.example.sales.entity.ProductCategory;
import com.example.sales.entity.ProductCategoryEmbeddable;



public interface ProductCategoryService {
	List<ProductCategory> findAll();
		
	ProductCategory findById(ProductCategoryEmbeddable  id);
	ProductCategory save(ProductCategory productCategory);
}
