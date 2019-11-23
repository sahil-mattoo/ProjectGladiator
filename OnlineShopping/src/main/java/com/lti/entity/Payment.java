package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OS_PAYMENT")
public class Payment {
	
	@Id
	@Column(name="TRANSACTION_ID")
	private int transactionId;
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="ORDER_ID")
	private int orderId;
	

	

}
