package com.doorit.spring.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.doorit.spring.model.Document;
import com.doorit.spring.model.ServiceAdvertisement;
import com.doorit.spring.model.User;


public interface DocumentService {

	public List<Document> list();
	public void save(MultipartFile file ,Document document);
	public void saveUser(MultipartFile file ,User document);
	public void saveQuote(MultipartFile file ,Document document);
	public User get(long id) ;
	public void remove(Integer id) ;
	public Document getQuoteFile(long prosId,long requestId) ;
	public Document getdownloadfile(long documentId);
	//public ServiceAdvertisement getuploadpic(long productId);
	public void save(MultipartFile file, ServiceAdvertisement serviceadvertisement);
	
	
	
}
