package com.example.demo.entity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "order_item")
public class OrderItem {

    @Id
    @Column(name = "order_item_id")
    private int orderItemId;

    @ManyToOne  // Many order items can belong to one product
    @JoinColumn(name = "product_id")
    private Product product; // Assuming you have a Product entity

    @ManyToOne  // Many order items can belong to one order
    @JoinColumn(name = "order_id")
    private Order order;   // Assuming you have an Order entity

    @Column(name = "sku", length = 100)
    private String sku;

    @Column(name = "price")
    private Float price;

    @Column(name = "discount")
    private Float discount;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @Column(name = "published_at")
    @Temporal(TemporalType.DATE)
    private Date publishedAt;

    public OrderItem() {
		super();
	}

	public OrderItem(int orderItemId, Product product, Order order, String sku, Float price, Float discount,
			int quantity, Date createdAt, Date updatedAt, Date publishedAt) {
		super();
		this.orderItemId = orderItemId;
		this.product = product;
		this.order = order;
		this.sku = sku;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.publishedAt = publishedAt;
	}

	public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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

	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", product=" + product + ", order=" + order + ", sku=" + sku
				+ ", price=" + price + ", discount=" + discount + ", quantity=" + quantity + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + ", publishedAt=" + publishedAt + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdAt, discount, order, orderItemId, price, product, publishedAt, quantity, sku,
				updatedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(discount, other.discount)
				&& Objects.equals(order, other.order) && Objects.equals(orderItemId, other.orderItemId)
				&& Objects.equals(price, other.price) && Objects.equals(product, other.product)
				&& Objects.equals(publishedAt, other.publishedAt) && Objects.equals(quantity, other.quantity)
				&& Objects.equals(sku, other.sku) && Objects.equals(updatedAt, other.updatedAt);
	}
    
    
}
