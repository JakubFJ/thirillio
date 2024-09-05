package com.semanticsquare.oop;

import java.util.Arrays;

public class Customer implements Cloneable {
	
	private String acctId;
	private String name;
	private int creditScore;
	
	private String[] accountTypes;
	
	public Customer(String acctId, String name, int creditScore) {
		super();
		this.acctId = acctId;
		this.name = name;
		this.creditScore = creditScore;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	public Customer clone() {
		try {
			return (Customer) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}