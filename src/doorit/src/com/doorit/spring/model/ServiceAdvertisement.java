package com.doorit.spring.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

/**
 * @param args
 * This class will hold the all Service Advertisement related images and offers.
 * @author SUSHANT KUMBHAR
 * 28/10/15
 */

@Entity
@Table(name = "SERVICEADVERTISEMENT")
public class ServiceAdvertisement implements java.io.Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="serviceAdv_id")
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	private long serviceAdv_id; // pk

	@Column(name="product_id")
    private long productId;
	
	public String getContentType() {
		return ContentType;
	}

	public void setContentType(String contentType) {
		ContentType = contentType;
	}

	@Column(name="text")
	String Text;
	
	
	@Column(name="imageUrl")
	@Lob
	private String imageUrl;

	@Version
	@Column(name = "content_type")
	private String ContentType;
	
	
		@Column(name="image_name", length = 1000)
		String imageName;
		
		@Version
		@Column(name = "version")
		private Date version;
		
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	
	
	

	
	@OneToMany(mappedBy = "serviceadvertisement" , cascade=CascadeType.ALL )
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	

	
	
	public long getServiceAdv_id() {
		return serviceAdv_id;
	}

	public void setServiceAdv_id(long serviceAdv_id) {
		this.serviceAdv_id = serviceAdv_id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
	

}
