package com.asthvinayak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asthvinayak.entity.Order;
import com.asthvinayak.onlineservice.VendorRepository;

@RestController
public class VendorService {
	
	@Autowired
	VendorRepository vendorRepository;
	
	@PostMapping("/order")
	public void  getOrder( @RequestBody Order order) {				
		vendorRepository.save(new Order("order_12","121112"));
		
	}
	
	@GetMapping("/getOrders")
	public List<Order>  getOrders() {		
			
		List<Order> list=vendorRepository.findAll();
		
		return list;
	}

}
