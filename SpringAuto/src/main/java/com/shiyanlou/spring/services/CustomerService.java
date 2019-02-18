package com.shiyanlou.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.shiyanlou.spring.dao.CustomerDAO;


public class CustomerService {

	@Autowired
	CustomerDAO dao ;

	@Override
	public String toString() {
		return "CustomerService [dao=" + dao + "]";
	}
	
	
}
