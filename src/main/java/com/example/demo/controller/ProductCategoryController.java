package com.example.demo.controller;

import com.example.demo.entity.ProductCategory;
import com.example.demo.entity.ProductCategoryEmbeddable;
import com.example.demo.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product_category")
public class ProductCategoryController {
	 @Autowired
	 private ProductCategoryService productCategoryService;

	    @GetMapping("/all")
	    public List<ProductCategory> getAllProductCategories() {
	        return productCategoryService.findAll();
	    }

	    @GetMapping("/byid/{id}")
	    public ProductCategory getProductCategoryById(@PathVariable ProductCategoryEmbeddable id) {
	        return productCategoryService.findById(id);
	    }
	    
	    
	    @PostMapping
	    public ProductCategory createProductCategory(@RequestBody ProductCategory productCategory) {
	        return productCategoryService.save(productCategory);
	    }
	
}
