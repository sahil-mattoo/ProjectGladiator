package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="OS_CART_ITEMS")
public class CartItems {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cart_item_generator")
	@SequenceGenerator(name="cart_item_generator", sequenceName="cart_item_generator", initialValue=1000, allocationSize=1)
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

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}


	
	

}
