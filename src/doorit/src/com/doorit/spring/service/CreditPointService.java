package com.doorit.spring.service;

import java.util.List;

import com.doorit.spring.model.CreditBalance;
import com.doorit.spring.model.CreditPack;
import com.doorit.spring.model.CreditProductMap;
import com.doorit.spring.model.Quotes;
import com.doorit.spring.model.RequestService;
import com.doorit.spring.model.User;
import com.doorit.spring.model.UserProsProfile;

public interface CreditPointService {

	

	public void saveProductCreditMapping(CreditProductMap CreditProductMap);

	public List<CreditProductMap> listCreditPoint();

	public void creditPackSave(CreditPack creditPack);

	List<CreditPack> retrieveCreditPackages();

	public void buyPack(CreditBalance creditbalance);

	public CreditProductMap getCreditProductMapById(long creditProductMapid);

	public void updatedCreditProductMapping(CreditProductMap creditProductMap);

	public CreditProductMap getCreditProductMapByProductId(long productId);

	public CreditBalance getCreditBalanceByUserId(long userId);

	public void addCreditBalance(User user);

	//public void deductCreditBalance(User user, int creditPoint);

	public void addcreditExpenseHistory(RequestService requestService,
			Quotes quotes,CreditProductMap creditProductMap, User user);

	public void deductCreditBalance(User user, CreditProductMap creditProductMap);

}
