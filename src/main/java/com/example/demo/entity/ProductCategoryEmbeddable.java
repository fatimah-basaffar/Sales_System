package com.example.sales.entity;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@NoArgsConstructor
@Data
@Embeddable
public class ProductCategoryEmbeddable implements Serializable {

	private int productId;
	private int categoryId;
	

	
}
