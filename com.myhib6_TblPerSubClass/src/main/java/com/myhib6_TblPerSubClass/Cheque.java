package com.myhib6_TblPerSubClass;

public class Cheque extends Payment {
	private String ChequeType;
	 
	public String getChequeType() {
		return ChequeType;
	}
 
	public void setChequeType(String chequeType) {
		ChequeType = chequeType;
	}
}
