package com.asthvinayak.onlineservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asthvinayak.entity.Order;

public interface VendorRepository extends JpaRepository < Order, Long > {

}
