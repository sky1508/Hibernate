package com.myhib4.Version;

public class Product {
	private int productId;
	private String proName;
	private double price;
	
	private int v;
	 
	public void setProductId(int productId)
	{
	    this.productId = productId;
	}
	public int getProductId()
	{
	    return productId;
	}
	 
	public void setProName(String proName)
	{
	    this.proName = proName;
	}
	public String getProName()
	{
	    return proName;
	}
	 
	public void setPrice(double price)
	{
	    this.price = price;
	}
	public double getPrice()
	{
	    return price;
	}
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}
}
