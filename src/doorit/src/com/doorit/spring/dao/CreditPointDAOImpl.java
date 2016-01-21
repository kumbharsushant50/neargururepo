package com.doorit.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.doorit.spring.model.CreditBalance;
import com.doorit.spring.model.CreditBuyHist;
import com.doorit.spring.model.CreditPack;
import com.doorit.spring.model.CreditProductMap;
import com.doorit.spring.model.CreditUsed;
import com.doorit.spring.model.Product;
import com.doorit.spring.model.Quotes;
import com.doorit.spring.model.User;

public class CreditPointDAOImpl implements CreditPointDao {

	private static final Logger logger = LoggerFactory.getLogger(CreditPointDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public void creditPackSave(CreditPack creditPack) {
		
		
		 Session session=this.sessionFactory.getCurrentSession();        
	        session.persist(creditPack);
		
	}
	
	@Override
	public CreditBalance getCreditBalanceByUserId(long userId){
		
		logger.info("get CreditBalance called>>"+this.getClass().getSimpleName());
		List<CreditBalance> creditbalanceList=new ArrayList<CreditBalance>();
		Session session = this.sessionFactory.getCurrentSession();	
		String sql = "select * from CREDIT_BLANCE  where userId=:userId";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(CreditBalance.class);
		query.setParameter("userId", userId);
		
		creditbalanceList = query.list();
		if (creditbalanceList.size() !=0)
		{
			logger.info("credit balance  for user id  loaded successfully>>"+this.getClass().getName());
		return creditbalanceList.get(0);
		}else
		{
			return null;	
		}
		
	
		
	}
	@Override
	public List<CreditPack> retrieveCreditPackages() {
		
		logger.info("retrieve list of CreditPack>>"+this.getClass().getSimpleName());
		Session session = this.sessionFactory.getCurrentSession();
		List<CreditPack> CreditPackList = session.createQuery("from CreditPack").list();
		
		logger.info(" list of CreditPack retrieved successfully>>"+CreditPackList.size()+">>"+this.getClass().getSimpleName());
		return CreditPackList;
	}

	@Override
	public void buyPack(CreditBalance creditbalance) {
		
		Session session=this.sessionFactory.getCurrentSession();        
        session.saveOrUpdate(creditbalance);
		
	}

	
	
	
	@Override
	public void saveCreditBuyHistory(CreditBuyHist creditBuyHist) {
		
		 Session session=this.sessionFactory.getCurrentSession();        
	        session.persist(creditBuyHist);
		
	}

	@Override
	public CreditPack getCreditPack() {
		
		logger.info("retrieve list of CreditPack>>"+this.getClass().getSimpleName());
		Session session = this.sessionFactory.getCurrentSession();
		List<CreditPack> CreditPackList = session.createQuery("from CreditPack").list();
		
		logger.info(" list of CreditPack retrieved successfully>>"+CreditPackList.size()+">>"+this.getClass().getSimpleName());
		return CreditPackList.get(0);
	}
	@Override
	public List<CreditProductMap> listCreditPoint() {
		
		Session session = this.sessionFactory.getCurrentSession();
		List<CreditProductMap> creditProductMapList = session.createQuery("from CreditProductMap").list();
		
		return creditProductMapList;
		
		
	}
	@Override
	public void saveProductCreditMapping(CreditProductMap CreditProductMap) {
		
		
		try{
		Session session=this.sessionFactory.getCurrentSession();		
		session.persist(CreditProductMap);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString()); 
		}
	}
	@Override
	public void updateProductCreditMapping(CreditProductMap CreditProductMap) {
		
		
		try{
		Session session=this.sessionFactory.getCurrentSession();		
		session.saveOrUpdate(CreditProductMap);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}
	
	@Override
	public CreditProductMap getCreditProductMapByProductId(long productId){
		
		logger.info("get CreditBalance called>>"+this.getClass().getSimpleName());
		List<CreditProductMap> creditProductMapList=new ArrayList<CreditProductMap>();
		Session session = this.sessionFactory.getCurrentSession();	
		String sql = "select * from CREDIT_PRDOUCT  where productId=:productId";
		SQLQuery query = session.createSQLQuery(sql);
		query.addEntity(CreditProductMap.class);
		query.setParameter("productId", productId);
		
		creditProductMapList = query.list(); 
		if (creditProductMapList.size() !=0)
		{
			logger.info("credit balance  for user id  loaded successfully>>"+this.getClass().getName());
		return creditProductMapList.get(0);
		}else
		{
			return null;	
		}
		
	
		
	}
	@Override
	public CreditProductMap getCreditProductMapById(long creditProductMapid) {
		
		logger.info("getProductById called>>"+this.getClass().getSimpleName());
		Session session = this.sessionFactory.getCurrentSession();		
		CreditProductMap creditProductMap = (CreditProductMap) session.load(CreditProductMap.class, new Long(creditProductMapid));
		logger.info("Product loaded successfully, Person details="+creditProductMap);
		//System.out.println("Product loaded successfully, Person details="+p);
		return creditProductMap;
	}

	@Override
	public void creditBalanceEntry(CreditBalance creditBalance) {
		
		Session session=this.sessionFactory.getCurrentSession();		
		session.persist(creditBalance); 
		
	}
	@Override
	public void updateBalanceEntry(CreditBalance creditBalance) {
		
		Session session=this.sessionFactory.getCurrentSession();		
		session.saveOrUpdate(creditBalance); 
		
	}

	@Override
	public void addcreditExpenseHistory(CreditUsed creditUsed) {
		
		Session session=this.sessionFactory.getCurrentSession();		
		session.persist(creditUsed); 
		
	}

	
}
