package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Admin;
import com.lti.repository.LoginRepository;

@Service("loginCheck")
public class LoginService{
	
	@Autowired
	private LoginRepository loginRepo;
	
	public boolean  adminLogin(String email, String password){
		int a= loginRepo.adminCheck(email, password);

		if(a==1)
		{
			return true;
		}
		
		else {
			return false;
		}		
	}
	
	public boolean customerLogin(String email, String password){
		int a= loginRepo.customerCheck(email, password);

		if(a==1)
		{
			return true;
		}
		
		else {
			return false;
		}
			
	}
	
	public boolean retailerLogin(String email, String password){
		int a= loginRepo.retailerCheck(email, password);

		if(a==1)
		{
			return true;
		}
		
		else {
			return false;
		}
			
	}
	
	
}
