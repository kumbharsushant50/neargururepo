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
@Table(name="CREDIT_PRDOUCT")
public class CreditProductMap implements Serializable {
	
	/**
	 * Credit product Mapping . 
	 * UI Screen to show the mapping to user/vendor.
	 * UI from Admin to map the credit point and product
	 */
	private static final long serialVersionUID = 1L;
	
	public CreditProductMap(){
		
	}
	@Id
	@Column(name="creditProductId")
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private long creditProductId;
	
	
	
	
	public long getCreditProductId() {
		return creditProductId;
	}

	public void setCreditProductId(long creditProductId) {
		this.creditProductId = creditProductId;
	}
	@Column(name="productId",unique=true , nullable = false )
	private  long productId; 
	
	
	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public int getCreditPoint() {
		return creditPoint;
	}

	public void setCreditPoint(int creditPoint) {
		this.creditPoint = creditPoint;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	private String productDesc;
	
	private int creditPoint;
	
	private Date lastUpdatedDate;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	
	
	
}
