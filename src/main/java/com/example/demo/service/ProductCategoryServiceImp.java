package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ProductCategory;
import com.example.demo.entity.ProductCategoryEmbeddable;
import com.example.demo.repository.ProductCategoryRepository;

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
