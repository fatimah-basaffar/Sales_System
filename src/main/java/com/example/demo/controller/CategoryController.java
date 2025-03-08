package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Category;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	 @Autowired
	 private CategoryService categoryService;

	    @GetMapping("/all")
	    public List<Category> getAllCategories() {
	        return categoryService.findAll();
	    }

	    @GetMapping("/byid/{id}")
	    public Category getCategoryById(@PathVariable int id) {
	        return categoryService.findById(id);
	    }
}
