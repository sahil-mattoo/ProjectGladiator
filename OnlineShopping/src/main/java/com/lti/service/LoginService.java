package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Admin;
import com.lti.entity.Customer;
import com.lti.entity.Retailer;
import com.lti.repository.LoginRepository;

@Service("loginCheck")
public class LoginService{
	
	@Autowired
	private LoginRepository loginRepo;
	
	public Admin  adminLogin(String email, String password){
		Admin a =  loginRepo.adminCheck(email, password);
		return a;
	}
	
	public Customer customerLogin(String email, String password){
		
		Customer c= loginRepo.customerCheck(email, password);
			return c;
	}
	
	public Retailer retailerLogin(String email, String password){
		Retailer r= loginRepo.retailerCheck(email, password);
		return r;
		}
			
	}
	
	

