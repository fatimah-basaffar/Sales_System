package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.ProductCategory;
import com.example.demo.entity.ProductCategoryEmbeddable;

public interface ProductCategoryService {
	List<ProductCategory> findAll();
		
	ProductCategory findById(ProductCategoryEmbeddable  id);
	ProductCategory save(ProductCategory productCategory);
}
