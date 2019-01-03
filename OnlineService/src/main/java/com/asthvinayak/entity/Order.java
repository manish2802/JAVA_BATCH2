package com.asthvinayak.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer_Order")
public class Order {
	
	@Id
	@Column
	private String orderId;
	@Column
	private String orderDate;
	
	public Order(){
		
	}
	
	public Order(String orderId,String orderDate){
		this.orderId=orderId;
		this.orderDate=orderDate;
	}
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
  
	
	
	

}
