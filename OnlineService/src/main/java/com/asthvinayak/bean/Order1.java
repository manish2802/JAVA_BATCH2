package com.asthvinayak.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ORDERS")
public class Order1 {

	@Id
	@Column
	String order_id;

	@Column
	String indexx;

	@Column
	String order_status;

	public Order1() {
	}
	public Order1(String index, String order_id, String order_status) {
		this.indexx = index;
		this.order_id = order_id;
		this.order_status = order_status;
	}

	public String getIndex() {
		return indexx;
	}

	public void setIndex(String index) {
		this.indexx = index;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

}
