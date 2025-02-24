package com.example.demo.entity;
import jakarta.persistence.*;


import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @Column(name = "order_id")
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user; // Assuming you have a User entity

    @Column(name = "session_id", length = 100)
    private String sessionId;

    @Column(name = "token", length = 100)
    private String token;

    @Column(name = "subtotal")
    private Float subtotal;

    @Column(name = "item_discount")
    private Float itemDiscount;

    @Column(name = "vat") 
    private Float vat;

    @Column(name = "shipping")
    private Float shipping;

    @Column(name = "total")
    private Float total;

    @Column(name = "promo_code", length = 50)
    private String promoCode;

    @Column(name = "discount")
    private Float discount;

    @Column(name = "grand_total")
    private Float grandTotal;

    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @Column(name = "content", length = 100)
//    @Lob  // For potentially large text
//    @Type(type = "org.hibernate.type.TextType", value = null)
    private String content;
    
    public Order() {
		super();
	}

	public Order(int orderId, User user, String sessionId, String token, Float subtotal, Float itemDiscount, Float vat,
			Float shipping, Float total, String promoCode, Float discount, Float grandTotal, Date createdAt,
			Date updatedAt, String content) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.sessionId = sessionId;
		this.token = token;
		this.subtotal = subtotal;
		this.itemDiscount = itemDiscount;
		this.vat = vat;
		this.shipping = shipping;
		this.total = total;
		this.promoCode = promoCode;
		this.discount = discount;
		this.grandTotal = grandTotal;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.content = content;
	}

	public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getItemDiscount() {
        return itemDiscount;
    }

    public void setItemDiscount(Float itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public Float getVat() {
        return vat;
    }

    public void setVat(Float vat) {
        this.vat = vat;
    }

    public Float getShipping() {
        return shipping;
    }

    public void setShipping(Float shipping) {
        this.shipping = shipping;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(Float grandTotal) {
        this.grandTotal = grandTotal;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", user=" + user + ", sessionId=" + sessionId + ", token=" + token
				+ ", subtotal=" + subtotal + ", itemDiscount=" + itemDiscount + ", vat=" + vat + ", shipping="
				+ shipping + ", total=" + total + ", promoCode=" + promoCode + ", discount=" + discount
				+ ", grandTotal=" + grandTotal + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", content="
				+ content + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(content, createdAt, discount, grandTotal, itemDiscount, orderId, promoCode, sessionId,
				shipping, subtotal, token, total, updatedAt, user, vat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(content, other.content) && Objects.equals(createdAt, other.createdAt)
				&& Objects.equals(discount, other.discount) && Objects.equals(grandTotal, other.grandTotal)
				&& Objects.equals(itemDiscount, other.itemDiscount) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(promoCode, other.promoCode) && Objects.equals(sessionId, other.sessionId)
				&& Objects.equals(shipping, other.shipping) && Objects.equals(subtotal, other.subtotal)
				&& Objects.equals(token, other.token) && Objects.equals(total, other.total)
				&& Objects.equals(updatedAt, other.updatedAt) && Objects.equals(user, other.user)
				&& Objects.equals(vat, other.vat);
	}
    
    
}
