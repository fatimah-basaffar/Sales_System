package com.example.demo.entity;

import java.util.Objects;
import jakarta.persistence.*;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory {

	@EmbeddedId
	private ProductCategoryEmbeddable ProCategoryId;
	
	@ManyToOne // many product category to one category
    @MapsId("categoryId")
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne // many product category to one product
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

	public ProductCategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductCategory(ProductCategoryEmbeddable proCategoryId, Category category, Product product) {
		super();
		ProCategoryId = proCategoryId;
		this.category = category;
		this.product = product;
	}

	public ProductCategoryEmbeddable getProCategoryId() {
		return ProCategoryId;
	}

	public void setProCategoryId(ProductCategoryEmbeddable proCategoryId) {
		ProCategoryId = proCategoryId;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ProCategoryId, category, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductCategory other = (ProductCategory) obj;
		return Objects.equals(ProCategoryId, other.ProCategoryId) && Objects.equals(category, other.category)
				&& Objects.equals(product, other.product);
	}

	@Override
	public String toString() {
		return "ProductCategory [ProCategoryId=" + ProCategoryId + ", category=" + category + ", product=" + product
				+ ", getProCategoryId()=" + getProCategoryId() + ", getCategory()=" + getCategory() + ", getProduct()="
				+ getProduct() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	} 
	
	
	
}
