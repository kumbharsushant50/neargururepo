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
@Table(name="CREDIT_BLANCE")
public class CreditBalance implements Serializable{
	
	/**
	 * show credit package to the user . Need to create one screen .
	 */
	private static final long serialVersionUID = 1L;
	
	public CreditBalance(){
		
	}
	@Id
	@Column(name="CreditBalnaceId")
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private int CreditBalnaceId;
	
	@Column(name="userId",unique=true , nullable = false )
	private long userId;
	
	
	private String  userType;
	
	public int getCreditBalnaceId() {
		return CreditBalnaceId;
	}

	public void setCreditBalnaceId(int creditBalnaceId) {
		CreditBalnaceId = creditBalnaceId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	

	

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getBalanceCreditPoint() {
		return balanceCreditPoint;
	}

	public void setBalanceCreditPoint(int balanceCreditPoint) {
		this.balanceCreditPoint = balanceCreditPoint;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	private int balanceCreditPoint ;
	
	private Date lastUpdatedDate;
	
	
	
	
}
