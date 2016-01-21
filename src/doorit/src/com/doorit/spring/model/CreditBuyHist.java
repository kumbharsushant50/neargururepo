package com.doorit.spring.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CREDIT_BUY_HIST")
public class CreditBuyHist implements Serializable {
	
	/**
	 * show credit package to the user . Need to create one screen .
	 */
	private static final long serialVersionUID = 1L;
	
	public  CreditBuyHist() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="CreditHistId")
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private int CreditHistId;
	
	public int getCreditHistId() {
		return CreditHistId;
	}

	public void setCreditHistId(int creditHistId) {
		CreditHistId = creditHistId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getCreditPackId() {
		return creditPackId;
	}

	public void setCreditPackId(int creditPackId) {
		this.creditPackId = creditPackId;
	}

	public int getCreditPoint() {
		return creditPoint;
	}

	public void setCreditPoint(int creditPoint) {
		this.creditPoint = creditPoint;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCreditType() {
		return creditType;
	}

	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}

	private long userId;
	
	private int creditPackId;
	
	private int creditPoint ;
	
	private int amount;
	           
	private String creditType; // Buy/referal/review/get hired 

	
	
	
	
}
