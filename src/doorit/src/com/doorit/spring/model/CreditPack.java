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
@Table(name="CREDITPACK")
public class CreditPack implements Serializable {
	
	/**
	 * show credit package to the user . Need to create one screen .
	 */
	private static final long serialVersionUID = 1L;
	
	private long amount;
	
	 public long getCreditPackID() {
		return creditPackID;
	}

	public void setCreditPackID(long creditPackID) {
		this.creditPackID = creditPackID;
	}

	public int getCreditPoint() {
		return creditPoint;
	}

	public void setCreditPoint(int creditPoint) {
		this.creditPoint = creditPoint;
	}

	public int getDiscountOnPack() {
		return discountOnPack;
	}

	public void setDiscountOnPack(int discountOnPack) {
		this.discountOnPack = discountOnPack;
	}

	public int getCreditPrice() {
		return creditPrice;
	}

	public void setCreditPrice(int creditPrice) {
		this.creditPrice = creditPrice;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public CreditPack() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@Column(name="creditPackID")
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private long creditPackID;
	
	private int creditPoint;
	
	//private int creditAmount;
	
	private int discountOnPack ;
	
	private int creditPrice; 
	
	private Date lastUpdatedDate;

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
	
	
}
