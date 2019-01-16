package com.asthvinayak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asthvinayak.bean.Order1;
import com.asthvinayak.repository.VendorRepository;

@RestController
public class VendorService {

	@Autowired
	VendorRepository vendorRepository;

	// @PostMapping("/order")
	// public void getOrder( @RequestBody Order order) {
	// vendorRepository.save(new Order("order_12","121112"));
	//
	// }

	@GetMapping("/get-orders")
	@CrossOrigin(origins = "https://angular-gnwngu.stackblitz.io")
	public List<Order1> getOrders() {
		System.out.println("getOrders");
		List<Order1> list = vendorRepository.findAll();

		return list;
	}

}
