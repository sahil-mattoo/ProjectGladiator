package com.lti.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="OS_RETAILER")
public class Retailer {
	
	@Id
	@Column(name="RETAILER_ID")
	private int retailerId;
	
	@Column(name="RETAILER_NAME")
	private String retailerName;
	
	@Column(name="ADDRESS")
	private String retailerAddress;
	
	@Column(name="PINCODE")
	private int pincode;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="EMAIL")
	private String retailerEmail;
	
	@Column(name="R_PASSWORD")
	private String retailerPassword;
	
	@Column(name="CONTACTNO")
	private String retailerContactNo;
	
	@OneToMany(mappedBy="retailer")
	List <Product> product; 
	

}
