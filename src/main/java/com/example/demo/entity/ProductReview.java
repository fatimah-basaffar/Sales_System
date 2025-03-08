package com.example.sales.entity;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "product_review")
public class ProductReview {
	
	@Id
    @Column(name ="product_review_id")
	private int productReviewId;
	
	//relationships key
	// product_id
	@ManyToOne  // many product review to one product
    @JoinColumn(name = "product_id")
    private Product product; // for Product entity
	
	// rating
	 @Column(name ="rating")
	 private int rating;
	 	 
	//published
	 @Column(name ="published")
	 private int published;
	 
	//created_at
	 @Column(name = "created_at")
	 @Temporal(TemporalType.DATE)
	 private Date createdAtRate;
	 
	//published_at
	 @Column(name = "published_at")
	 @Temporal(TemporalType.DATE)
	 private Date publishedAtRate;
	 
	//content 
	 @Column(name ="content")
	 private String content;

	 public ProductReview() {
			super();
	 }
	 
	public ProductReview(int productReviewId, Product product, int rating, int published, Date createdAtRate,
			Date publishedAtRate, String content) {
		super();
		this.productReviewId = productReviewId;
		this.product = product;
		this.rating = rating;
		this.published = published;
		this.createdAtRate = createdAtRate;
		this.publishedAtRate = publishedAtRate;
		this.content = content;
	}

	public int getProductReviewId() {
		return productReviewId;
	}

	public void setProductReviewId(int productReviewId) {
		this.productReviewId = productReviewId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPublished() {
		return published;
	}

	public void setPublished(int published) {
		this.published = published;
	}

	public Date getCreatedAtRate() {
		return createdAtRate;
	}

	public void setCreatedAtRate(Date createdAtRate) {
		this.createdAtRate = createdAtRate;
	}

	public Date getPublishedAtRate() {
		return publishedAtRate;
	}

	public void setPublishedAtRate(Date publishedAtRate) {
		this.publishedAtRate = publishedAtRate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, createdAtRate, product, productReviewId, published, publishedAtRate, rating);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductReview other = (ProductReview) obj;
		return Objects.equals(content, other.content) && Objects.equals(createdAtRate, other.createdAtRate)
				&& Objects.equals(product, other.product) && productReviewId == other.productReviewId
				&& published == other.published && Objects.equals(publishedAtRate, other.publishedAtRate)
				&& rating == other.rating;
	}

	@Override
	public String toString() {
		return "ProductReview [productReviewId=" + productReviewId + ", product=" + product + ", rating=" + rating
				+ ", published=" + published + ", createdAtRate=" + createdAtRate + ", publishedAtRate="
				+ publishedAtRate + ", content=" + content + "]";
	}
	 
	

}
