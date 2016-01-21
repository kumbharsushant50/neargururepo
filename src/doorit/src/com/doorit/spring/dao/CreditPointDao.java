package com.doorit.spring.dao;

import java.util.List;

import com.doorit.spring.model.CreditBalance;
import com.doorit.spring.model.CreditBuyHist;
import com.doorit.spring.model.CreditPack;
import com.doorit.spring.model.CreditProductMap;
import com.doorit.spring.model.CreditUsed;
import com.doorit.spring.model.User;

public interface CreditPointDao {

	public void creditPackSave(CreditPack creditPack);

	public List<CreditPack> retrieveCreditPackages();

	public void buyPack(CreditBalance creditbalance);

	public CreditBalance getCreditBalanceByUserId(long userId);

	public void saveCreditBuyHistory(CreditBuyHist creditBuyHist);

	public CreditPack getCreditPack();
	public List<CreditProductMap> listCreditPoint();
	
	public void saveProductCreditMapping(CreditProductMap CreditProductMap);

	public CreditProductMap getCreditProductMapById(long creditProductMapid);

	public void updateProductCreditMapping(CreditProductMap CreditProductMap);

	public CreditProductMap getCreditProductMapByProductId(long productId);

	

	public void creditBalanceEntry(CreditBalance creditBalance);

	void updateBalanceEntry(CreditBalance creditBalance);

	

	public void addcreditExpenseHistory(CreditUsed creditUsed);

	

}
