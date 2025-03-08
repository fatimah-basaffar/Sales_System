package com.example.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sales.entity.Category;
import com.example.sales.entity.OrderItem;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
