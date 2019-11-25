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

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public String getRetailerAddress() {
		return retailerAddress;
	}

	public void setRetailerAddress(String retailerAddress) {
		this.retailerAddress = retailerAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRetailerEmail() {
		return retailerEmail;
	}

	public void setRetailerEmail(String retailerEmail) {
		this.retailerEmail = retailerEmail;
	}

	public String getRetailerPassword() {
		return retailerPassword;
	}

	public void setRetailerPassword(String retailerPassword) {
		this.retailerPassword = retailerPassword;
	}

	public String getRetailerContactNo() {
		return retailerContactNo;
	}

	public void setRetailerContactNo(String retailerContactNo) {
		this.retailerContactNo = retailerContactNo;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	} 
	
	
	

}
