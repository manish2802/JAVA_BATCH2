package com.asthvinayak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asthvinayak.bean.Order1;

@Repository
public interface VendorRepository extends JpaRepository < Order1, String > {

}
