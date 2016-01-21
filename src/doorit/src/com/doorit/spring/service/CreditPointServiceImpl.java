package com.doorit.spring.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.doorit.spring.dao.AdminDAO;
import com.doorit.spring.dao.CreditPointDao;
import com.doorit.spring.model.CreditBalance;
import com.doorit.spring.model.CreditBuyHist;
import com.doorit.spring.model.CreditPack;
import com.doorit.spring.model.CreditProductMap;
import com.doorit.spring.model.CreditUsed;
import com.doorit.spring.model.Product;
import com.doorit.spring.model.Quotes;
import com.doorit.spring.model.RequestService;
import com.doorit.spring.model.User;
import com.doorit.spring.model.UserProsProfile;

public class CreditPointServiceImpl implements CreditPointService {

	private static final Logger LOGGER= LoggerFactory.getLogger(CreditPointServiceImpl.class);
	
		@Autowired
	    private CreditPointDao creditPointDao;
		
		@Autowired
		 private AdminDAO adminDAO;
	    
	    public void setCreditPointDao(CreditPointDao creditPointDao) {
	        this.creditPointDao = creditPointDao;
	    }

	/***********************************copyright@Nearguru************************************************************
	 * method -fetch list of  credit point map
	 * created date - 11 sep 2015
	 * ******************************************************************************************/
	@Transactional
	@Override
	public List<CreditProductMap> listCreditPoint() {
		
		List<CreditProductMap> creditProductMapList=this.creditPointDao.listCreditPoint();
		
		List<CreditProductMap> creditProductMapListfinal=new ArrayList<CreditProductMap>();
		for(CreditProductMap creditProductMap:creditProductMapList){
			
			Product product=this.adminDAO.getProductById(creditProductMap.getProductId());
			creditProductMap.setProductDesc(product.getProductDesc());
			creditProductMapListfinal.add(creditProductMap);
		}
		
		return creditProductMapListfinal;
	
	 }
	/***********************************copyright@Nearguru************************************************************
	 * method -method to save credit pack
	 * created date - 11 sep 2015
	 * ******************************************************************************************/
	 @Transactional    
	@Override
	public void creditPackSave(CreditPack creditPack) {
		
		creditPack.setAmount(creditPack.getCreditPrice()*creditPack.getCreditPoint());
	    	 this.creditPointDao.creditPackSave(creditPack);
		
	}
	 /***********************************copyright@Nearguru************************************************************
		 * method -method to save credit pack
		 * created date - 11 sep 2015
		 * ******************************************************************************************/
		 @Transactional    
		@Override
		public List<CreditPack> retrieveCreditPackages() {
			
		    	 return this.creditPointDao.retrieveCreditPackages();
			
		}

		 /***********************************copyright@Nearguru************************************************************
			 * method -method to buy credit pack
			 * created date - 11 sep 2015
	
		 *******************************************************************************************/
	@Transactional
	@Override
	public void buyPack(CreditBalance creditbalance) {
		
		CreditBalance creditBalanncePrevious=this.creditPointDao.getCreditBalanceByUserId(creditbalance.getUserId());
		if(creditBalanncePrevious!=null){
			creditBalanncePrevious.setBalanceCreditPoint(creditBalanncePrevious.getBalanceCreditPoint()+creditbalance.getBalanceCreditPoint());
			
		}
		else{
			
			creditBalanncePrevious=creditbalance;
			
		}
		creditBalanncePrevious.setLastUpdatedDate(new Date());
		this.creditPointDao.buyPack(creditBalanncePrevious);
		//TODO
		CreditPack creditPack=this.creditPointDao.getCreditPack();
		
		//give a call to credit package table to get get the credit price
		CreditBuyHist creditBuyHist=new CreditBuyHist();
		creditBuyHist.setCreditPoint(creditbalance.getBalanceCreditPoint());
		creditBuyHist.setCreditPackId(1);
		creditBuyHist.setAmount(creditBuyHist.getCreditPoint()*creditPack.getCreditPrice());
		creditBuyHist.setUserId(creditbalance.getUserId());
		//flag to capture credit type
		String creditflag="Buy";
		if(creditflag.equals("Buy")){
		
		creditBuyHist.setCreditType("Buy");
		}
		this.creditPointDao.saveCreditBuyHistory(creditBuyHist);
		
	}
		
		@Transactional
		@Override
		public void saveProductCreditMapping(CreditProductMap CreditProductMap) {
			
			CreditProductMap.setLastUpdatedDate(new Date());
			this.creditPointDao.saveProductCreditMapping(CreditProductMap);
			
			
		}
		 /***********************************copyright@Nearguru************************************************************
		 * method -method to get credir product mapping by Id
		 * created date - 11 sep 2015

	 *******************************************************************************************/
		@Transactional
		@Override
		public CreditProductMap getCreditProductMapById(long creditProductMapid) {
			
			return	this.creditPointDao.getCreditProductMapById(creditProductMapid);
			
		}
		
		@Transactional
		@Override
		public CreditProductMap getCreditProductMapByProductId(long productId){
			
			return this.creditPointDao.getCreditProductMapByProductId(productId);
		}
		@Transactional 
		@Override
		public void updatedCreditProductMapping( 
				CreditProductMap creditProductMap) {
			
			CreditProductMap creditProductMapOriginal=this.creditPointDao.getCreditProductMapByProductId(creditProductMap.getProductId());
			creditProductMapOriginal.setLastUpdatedDate(new Date());
			creditProductMapOriginal.setCreditPoint(creditProductMap.getCreditPoint());
			this.creditPointDao.updateProductCreditMapping(creditProductMapOriginal);
			
		}

		@Transactional
		@Override
		public CreditBalance getCreditBalanceByUserId(long userId) {
			// TODO Auto-generated method stub
			return this.creditPointDao.getCreditBalanceByUserId(userId);
		}

		@Transactional
		@Override
		public void addCreditBalance(User user) {
			
			CreditBalance creditBalance=new CreditBalance();
			creditBalance.setBalanceCreditPoint(0);
			creditBalance.setLastUpdatedDate(new Date());
			creditBalance.setUserId(user.getUserId());
			creditBalance.setUserType(user.getUserType());
			this.creditPointDao.creditBalanceEntry(creditBalance);
			
		} 
		@Transactional
		@Override
		public void deductCreditBalance(User user, CreditProductMap creditProductMap) { 
			
			
			CreditBalance creditBalance=this.getCreditBalanceByUserId(user.getUserId());
			creditBalance.setBalanceCreditPoint(creditBalance.getBalanceCreditPoint()-creditProductMap.getCreditPoint());
			creditBalance.setLastUpdatedDate(new Date());
			this.creditPointDao.updateBalanceEntry(creditBalance);
			
		}
		
		@Transactional
		@Override
		public void addcreditExpenseHistory(RequestService requestService,
				Quotes quotes,CreditProductMap CreditProductMap, User user) {
		
			CreditUsed creditUsed=new CreditUsed();
			creditUsed.setQuoteId(quotes.getQuoteId());
			creditUsed.setRequtesId(requestService.getRequestId());
			creditUsed.setUserId(user.getUserId());
			creditUsed.setCreditPoint(CreditProductMap.getCreditPoint());
			
				this.creditPointDao.addcreditExpenseHistory(creditUsed);
				
			
		}

		
	
}
