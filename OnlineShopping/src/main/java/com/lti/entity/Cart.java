package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OS_CART")
public class Cart {

	@Id
	@Column(name="CART_ID")
	private int cartId;
	
	@Column(name="TOTAL")
	private int total;
	
	@JoinColumn(name="CUSTOMER_ID")
	@OneToOne
	private Customer customer;
	
	@OneToMany(mappedBy="cart")
	private List<CartItems> cartItems;
	
	
}
