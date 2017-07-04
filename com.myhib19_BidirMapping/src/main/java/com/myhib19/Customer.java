package com.myhib19;

public class Customer {
	private int customerId;
	private String customerName;
	private int forevenId;
	private Vendor parentObjects;
	 
	public Vendor getParentObjects() {
		return parentObjects;
	}
	public void setParentObjects(Vendor parentObjects) {
		this.parentObjects = parentObjects;
	}
	public int getCustomerId() {
	return customerId;
	}
	public void setCustomerId(int customerId) {
	this.customerId = customerId;
	}
	public String getCustomerName() {
	return customerName;
	}
	public void setCustomerName(String customerName) {
	this.customerName = customerName;
	}
	public int getForevenId() {
		return forevenId;
	}
	public void setForevenId(int forevenId) {
		this.forevenId = forevenId;
	}
}
