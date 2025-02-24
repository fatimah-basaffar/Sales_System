package com.example.demo.entity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "product_id")
    private int productId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Assuming you have a User entity

    @Column(name = "time", length = 75) // Added length
    private String time;

    @Column(name = "slug", length = 100) // Added length
    private String slug;

    @Column(name = "summary", length = 1000) // Added length
    private String summary;

    @Column(name = "type") // Explicitly define columnDefinition
    private int type;

    @Column(name = "sku", length = 100)  // Added length
    private String sku;

    @Column(name = "price")
    private Float price;

    @Column(name = "discount")
    private Float discount;

    @Column(name = "quantity") // Explicitly define columnDefinition
    private int quantity;

    @Column(name = "is_available")
    private Boolean isAvailable;

    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @Column(name = "published_at")
    @Temporal(TemporalType.DATE)
    private Date publishedAt;

    @Column(name = "starts_at")
    @Temporal(TemporalType.DATE)
    private Date startsAt;

    @Column(name = "ends_at")
    @Temporal(TemporalType.DATE)
    private Date endsAt;

    @Column(name = "content", length = 1000) 
    private String content;
  
    public Product() {
		super();
	}

	public Product(int productId, User user, String time, String slug, String summary, Short type, String sku,
			Float price, Float discount, int quantity, Boolean isAvailable, Date createdAt, Date updatedAt,
			Date publishedAt, Date startsAt, Date endsAt, String content) {
		super();
		this.productId = productId;
		this.user = user;
		this.time = time;
		this.slug = slug;
		this.summary = summary;
		this.type = type;
		this.sku = sku;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.isAvailable = isAvailable;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.publishedAt = publishedAt;
		this.startsAt = startsAt;
		this.endsAt = endsAt;
		this.content = content;
	}

	public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Date getStartsAt() {
        return startsAt;
    }

    public void setStartsAt(Date startsAt) {
        this.startsAt = startsAt;
    }

    public Date getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Date endsAt) {
        this.endsAt = endsAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", user=" + user + ", time=" + time + ", slug=" + slug + ", summary="
				+ summary + ", type=" + type + ", sku=" + sku + ", price=" + price + ", discount=" + discount
				+ ", quantity=" + quantity + ", isAvailable=" + isAvailable + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", publishedAt=" + publishedAt + ", startsAt=" + startsAt + ", endsAt="
				+ endsAt + ", content=" + content + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, createdAt, discount, endsAt, isAvailable, price, productId, publishedAt, quantity,
				sku, slug, startsAt, summary, time, type, updatedAt, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(content, other.content) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(discount, other.discount) && Objects.equals(endsAt, other.endsAt)
				&& Objects.equals(isAvailable, other.isAvailable) && Objects.equals(price, other.price)
				&& Objects.equals(productId, other.productId) && Objects.equals(publishedAt, other.publishedAt)
				&& Objects.equals(quantity, other.quantity) && Objects.equals(sku, other.sku)
				&& Objects.equals(slug, other.slug) && Objects.equals(startsAt, other.startsAt)
				&& Objects.equals(summary, other.summary) && Objects.equals(time, other.time)
				&& Objects.equals(type, other.type) && Objects.equals(updatedAt, other.updatedAt)
				&& Objects.equals(user, other.user);
	}
    
	
    
}