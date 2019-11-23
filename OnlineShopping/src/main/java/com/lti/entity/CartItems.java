package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OS_CART_ITEMS")
public class CartItems {
	
	@Id
	@Column(name="CART_ITEM_ID")
	private int cartItemId;
	
	@JoinColumn(name="PRODUCT_ID")
	@OneToOne
	private Product  product;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@JoinColumn(name="CART_ID")
	@ManyToOne
	private Cart cart;
	

}
