package com.myhib6_TblPerSubClass;

public class CreditCard extends Payment {
	private String CreditCardType;
	 
	public String getCreditCardType() {
		return CreditCardType;
	}
 
	public void setCreditCardType(String creditCardType) {
		CreditCardType = creditCardType;
	}
}
