package com.example.demo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@NoArgsConstructor
@Data
@Embeddable
public class ProductCategoryEmbeddable implements Serializable {
	
	@Column(name = "product_id")
    private int productId;

    @Column(name = "category_id")
    private int categoryId;
		
}
