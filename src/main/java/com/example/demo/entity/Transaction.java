package com.example.demo.entity;

import java.util.Objects;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;
    
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(name = "code", length = 100, unique = true)
    private String code;

    @Column(name = "mode", nullable = false)
    private Short mode;

    @Column(name = "state", nullable = false)
    private Short state;

    @Column(name = "content")
    private String content;

	public Transaction() {
		super();
	}

	public Transaction(Long transactionId, User user, Order order, String code, Short mode, Short state,
			String content) {
		super();
		this.transactionId = transactionId;
		this.user = user;
		this.order = order;
		this.code = code;
		this.mode = mode;
		this.state = state;
		this.content = content;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Short getMode() {
		return mode;
	}

	public void setMode(Short mode) {
		this.mode = mode;
	}

	public Short getState() {
		return state;
	}

	public void setState(Short state) {
		this.state = state;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", user=" + user + ", order=" + order + ", code=" + code
				+ ", mode=" + mode + ", state=" + state + ", content=" + content + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, content, mode, order, state, transactionId, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(code, other.code) && Objects.equals(content, other.content)
				&& Objects.equals(mode, other.mode) && Objects.equals(order, other.order)
				&& Objects.equals(state, other.state) && Objects.equals(transactionId, other.transactionId)
				&& Objects.equals(user, other.user);
	}
    
}