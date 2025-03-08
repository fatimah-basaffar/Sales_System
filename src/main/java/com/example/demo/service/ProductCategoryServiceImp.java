package com.example.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sales.entity.ProductCategory;
import com.example.sales.entity.ProductCategoryEmbeddable;
import com.example.sales.repository.ProductCategoryRepository;


@Service
public class ProductCategoryServiceImp implements ProductCategoryService{

	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	@Override
	public List<ProductCategory> findAll() {
		return productCategoryRepository.findAll();
	}

	@Override
	public ProductCategory findById(ProductCategoryEmbeddable  id) {
		return productCategoryRepository.findById(id).orElse(null);
	}
	
	 @Override
	    public ProductCategory save(ProductCategory productCategory) {
	        return productCategoryRepository.save(productCategory);  
	    }
}
