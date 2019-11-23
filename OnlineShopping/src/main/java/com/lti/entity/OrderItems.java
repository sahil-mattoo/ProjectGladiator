package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OS_ORDER_ITEMS")
public class OrderItems {
	
	@Id
	@Column(name="ORDER_ITEM_ID")
	private int orderItemId;
	
	@JoinColumn(name="ORDER_ID")
	@ManyToOne
	private Orders order;
	
	@JoinColumn(name="PRODUCT_ID")
	@OneToOne
	private Product product;
	
	
	@Column(name="PRODUCT_QUANTITY")
	private int productQuantity;


	public int getOrderItemId() {
		return orderItemId;
	}


	public void setOrderItemId(int orderItemId) {
		this.orderItemId = orderItemId;
	}


	public Orders getOrder() {
		return order;
	}


	public void setOrder(Orders order) {
		this.order = order;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}


	public int getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
	
}
