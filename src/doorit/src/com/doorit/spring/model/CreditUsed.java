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
@Table(name="CREDIT_USED")
public class CreditUsed implements Serializable {
	
	/**
	 * show credit package to the user . Need to create one screen .
	 */
	private static final long serialVersionUID = 1L;
	
	 public int getCreditUsedId() {
		return CreditUsedId;
	}

	public void setCreditUsedId(int creditUsedId) {
		CreditUsedId = creditUsedId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	

	public void setRequtesId(int requtesId) {
		this.requtesId = requtesId;
	}

	
	public long getRequtesId() {
		return requtesId;
	}

	public void setRequtesId(long requtesId) {
		this.requtesId = requtesId;
	}

	public long getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(long quoteId) {
		this.quoteId = quoteId;
	}

	public void setQuoteId(int quoteId) {
		this.quoteId = quoteId;
	}

	

	public int getCreditPoint() {
		return creditPoint;
	}

	public void setCreditPoint(int creditPoint) {
		this.creditPoint = creditPoint;
	}

	public CreditUsed() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="CreditUsedId")
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private int CreditUsedId;
	
	private long userId;
	
	private long requtesId;
	
	private long quoteId ;
	
	private int creditPoint;
	
	
	
	
}
