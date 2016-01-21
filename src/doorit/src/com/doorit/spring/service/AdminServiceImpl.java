package com.doorit.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.doorit.spring.dao.AdminDAO;
import com.doorit.spring.model.Option;
import com.doorit.spring.model.Product;
import com.doorit.spring.model.ProductGroup;
import com.doorit.spring.model.Question;
import com.doorit.spring.model.User;

@Service
public class AdminServiceImpl implements AdminService {
	
	private AdminDAO adminDAO;
	
		
	public void setAdminDAO(AdminDAO adminDAO) {
		this.adminDAO = adminDAO;
	}

	@Override
	@Transactional
	public void addProduct(ProductGroup pg , Product p) {
		this.adminDAO.addProduct( pg , p);
		
	}

	@Override
	@Transactional
	public void addUser(User user) {
		
		this.adminDAO.addUser(user);
		
	}

	@Override
	@Transactional
	public List<Product> listProduct() {
		return this.adminDAO.listProduct();
	}

	@Override
	@Transactional
	public Product getProductById(long id) {
			return this.adminDAO.getProductById(id);
	}

	@Override
	@Transactional
	public void addQuestion(Product p ,Question q) {
		this.adminDAO.addQuestion(p, q);
		
	}

	@Override
	@Transactional
	public List<Question> listQuestion() {
		return this.adminDAO.listQuestion();
	}

	@Override
	@Transactional
	public void addOption(Option o, Question q) {
		this.adminDAO.addOption(o, q);
		
	}

	@Override
	@Transactional
	public Question getQuestionById(long id) {
		return this.adminDAO.getQuestionById(id);
	}

	@Override
	@Transactional
	public List<Option> listOption() {
		return this.adminDAO.listOption();
		
	}

	@Override
	@Transactional
	public Option getOptionById(long id) {
		return this.adminDAO.getOptionById(id);
		
	}

	@Override
	@Transactional
	public List<Question> getQuesByProductId(long id) {
		return this.adminDAO.getQuesByProductId( id);
	}

	@Override
	@Transactional
	public List<Option> getOptionByQueId(long id) {
		return this.adminDAO.getOptionByQueId( id);
	}

	@Override
	@Transactional
	public void addProductGroup(ProductGroup p) {
		this.adminDAO.addProductGroup(p);
		
	}

	@Override
	@Transactional
	public List<ProductGroup> listProductGroup() {
		return this.adminDAO.listProductGroup();
		
	}

	@Override
	@Transactional
	public ProductGroup getProductGroupById(long id) {
		return this.adminDAO.getProductGroupById( id);
	}

	@Override
	@Transactional
	public List<Product> listProductByTag( String tagName) {
			
		return this.adminDAO.listProductByTag(tagName);
	}

	@Override
	@Transactional
	public List<Product> listProductByProductGroup(long productGroupId) {
		
		return this.adminDAO.listProductByProductGroup(productGroupId);
	}

	@Override
	@Transactional
	public void removeProductGroup(long id) {
		 this.adminDAO.removeProductGroup(id);
		
	}

	@Override
	@Transactional
	public void removeProduct(long id) {
		this.adminDAO.removeProduct(id);
		
	}
	
	@Transactional
	@Override
	public void saveProductGroup(ProductGroup productGroup) {
		
		ProductGroup productGroupObj=this.adminDAO.getProductGroupById(productGroup.getProductGroupId());
		productGroupObj.setProductGroupName(productGroup.getProductGroupName());
		productGroupObj.setProductGroupDesc(productGroup.getProductGroupDesc());
		this.adminDAO.saveProductGroup(productGroupObj);
		
	}
	@Transactional
	@Override
	public void updateProduct(Product product) {
		
		Product productObj=this.adminDAO.getProductById(product.getProductId());
		productObj.setProductName(product.getProductName());
		productObj.setProductDesc(product.getProductDesc());
		this.adminDAO.updateProduct(productObj);
		
	}
	@Transactional
	@Override
	public void updateOption(Option option) {
		
		Option OptionObj=this.adminDAO.getOptionById(option.getOptId());
		OptionObj.setOptDesc(option.getOptDesc());
		
		this.adminDAO.updateOption(OptionObj);
		
	}
	@Transactional
	@Override
	public void deleteOption(long optionId) {
		
		this.adminDAO.deleteOption(optionId);
		
	}
	@Transactional
	@Override
	public void deleteQuestion(long questionId) {
		
		this.adminDAO.deleteQuestion(questionId);
	}

	@Transactional
	@Override
	public void deleteProduct(long productId) {
		
		this.adminDAO.deleteProduct(productId);
		
	}
	@Transactional
	@Override
	public void deleteProductGroup(long productGroupId) {
		
		this.adminDAO.deleteProductGroup(productGroupId);
		
	}

	@Transactional
	@Override
	public void updateQuestion(Question question) {
		
		Question QuestionObj=this.adminDAO.getQuestionById(question.getQueId());
		
		QuestionObj.setQueDesc(question.getQueDesc());
		QuestionObj.setQueType(question.getQueType());
		QuestionObj.setQueReq(question.getQueReq());
		QuestionObj.setMaxLen(question.getMaxLen());
		QuestionObj.setName_class(question.getName_class());
		
		this.adminDAO.updateQuestion(QuestionObj);
		
	}

	




	
}
