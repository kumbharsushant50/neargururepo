package com.doorit.spring.Controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.doorit.spring.model.CreditBalance;
import com.doorit.spring.model.CreditPack;
import com.doorit.spring.model.CreditProductMap;
import com.doorit.spring.model.Product;
import com.doorit.spring.model.Reports;
import com.doorit.spring.model.User;
import com.doorit.spring.service.AdminService;
import com.doorit.spring.service.CreditPointService;

@Controller
public class CreditController {

	@Autowired
	AdminService adminService;
	
	@Autowired  
	CreditPointService creditPointService;
	
	private Logger LOGGER = Logger.getLogger(CreditController.class);
	
	
	/***********************************copyright@Nearguru************************************************************
	 * method -credit product mapping 
	 * created date -11 Sep 2015
	 * created by  : divyanayan Awasthi
	 * ******************************************************************************************/
	@RequestMapping(value="/admin/creditProductMapping",method=RequestMethod.GET)
	public String creditProductMapping(Model model,@ModelAttribute("creditProductMap") CreditProductMap creditProductMap){
	
		final String methodname="creditProductMapping(Model model,@ModelAttribute("+creditProductMap+") CreditProductMap creditProductMap)";
		LOGGER.debug("credit product mapping initiated"+" - method name - "+methodname+" - "+ this.getClass().getSimpleName());
		List<Product> productList=this.adminService.listProduct();
		List<CreditProductMap> creditProductMapList=this.creditPointService.listCreditPoint();
		model.addAttribute("creditProductMapList",creditProductMapList);
		model.addAttribute("productList",productList); 
		LOGGER.debug("credit Product mapping displayed successfully,request size"+productList.size()+" - "+" - method name - "+methodname+" - "+ this.getClass().getSimpleName());
		return "creditProductMapping";
	}
	
	
	@RequestMapping(value="/admin/saveProductMapping",method=RequestMethod.POST) 
	public String saveCreditProductMapping(Model model,@ModelAttribute("creditProductMap") CreditProductMap creditProductMap){
	
		final String methodname="saveCreditProductMapping(Model model,@ModelAttribute("+creditProductMap+") CreditProductMap creditProductMap)";
		LOGGER.debug("save credit product mapping initiated"+" - method name - "+methodname+" - "+ this.getClass().getSimpleName());
		List<Product> productList=this.adminService.listProduct();
		List<CreditProductMap> creditProductMapList=this.creditPointService.listCreditPoint();
		model.addAttribute("creditProductMapList",creditProductMapList);
		model.addAttribute("productList",productList);
		this.creditPointService.saveProductCreditMapping(creditProductMap);
		LOGGER.debug("credit Product mapping saved successfully,request size"+productList.size()+" - "+" - method name - "+methodname+" - "+ this.getClass().getSimpleName());
		return "creditProductMapping";
	}
	
	@RequestMapping(value="/admin/updateCreditProductMapping/{creditProductMapid}",method={RequestMethod.POST,RequestMethod.GET}) 
	public String updateCreditProductMapping(Model model,@ModelAttribute("creditProductMap") CreditProductMap creditProductMap,@PathVariable("creditProductMapid") long creditProductMapid ){
	
		final String methodname="updateCreditProductMapping(Model model,@ModelAttribute("+creditProductMap+") CreditProductMap creditProductMap)";
		LOGGER.debug("save credit product mapping initiated"+" - method name - "+methodname+" - "+ this.getClass().getSimpleName());
		model.addAttribute("creditProductMap",this.creditPointService.getCreditProductMapById(creditProductMapid));
		//List<Product> productList=this.adminService.listProduct();
		//model.addAttribute("productList",productList);
		//LOGGER.debug("credit Product mapping saved successfully,request size"+productList.size()+" - "+" - method name - "+methodname+" - "+ this.getClass().getSimpleName());
		return "updateCreditProductMapping"; 
		
		
		
	}
	
	
	
	@RequestMapping(value="/admin/updatedCreditProductMapping",method=RequestMethod.POST) 
	public String updatedCreditProductMapping(Model model,@ModelAttribute("creditProductMap") CreditProductMap creditProductMap){
	
		final String methodname="updateCreditProductMapping(Model model,@ModelAttribute("+creditProductMap+") CreditProductMap creditProductMap)";
		LOGGER.debug("save credit product mapping initiated"+" - method name - "+methodname+" - "+ this.getClass().getSimpleName());
		this.creditPointService.updatedCreditProductMapping(creditProductMap);
		model.addAttribute("creditProductMap",this.creditPointService.getCreditProductMapByProductId(creditProductMap.getProductId()));
		List<Product> productList=this.adminService.listProduct();
		List<CreditProductMap> creditProductMapList=this.creditPointService.listCreditPoint();
		model.addAttribute("creditProductMapList",creditProductMapList);
		model.addAttribute("productList",productList); 
		return "creditProductMapping";
	}
	
	/***********************************copyright@Nearguru************************************************************
	 * method -display credit pack page for display
	 * created date - 2nd  May 2015
	 * ******************************************************************************************/
	@RequestMapping(value = "/admin/creditPack", method =RequestMethod.GET)	
	public String CceditPack(ModelMap model,@ModelAttribute("CreditPack") CreditPack creditPack){
		
		//this.cred.CreditPackSave(CreditPack);
		model.addAttribute("creditPack", creditPack);
		return "createCreditacks";
	}
	
	@RequestMapping(value = "/admin/saveCreditPack", method = {RequestMethod.POST})	
	public String CreditPackSave(ModelMap model,@ModelAttribute("CreditPack")CreditPack creditPack){
		
		
		
		this.creditPointService.creditPackSave(creditPack);
		model.addAttribute("creditPack", creditPack);
		return "createCreditacks";  
	}
	
	/***********************************copyright@Nearguru************************************************************
	 * method -retrieve packages for display
	 * created date - 2nd  May 2015
	 * ******************************************************************************************/
	@RequestMapping(value = "/creditPackages", method = RequestMethod.POST)	
	public String listCreditPack(ModelMap model,@ModelAttribute("CreditPack")CreditPack CreditPack){
		
		//it will return list of credit package,save it in a list an dsend it back as a model to UI
		//to have a look in the list....can use for loop to test or debug mode
		
		List<CreditPack> creditPackList=this.creditPointService.retrieveCreditPackages();
	
		model.addAttribute("creditPackList", creditPackList);
		model.addAttribute("CreditPack", CreditPack);
		return "packages"; 
	}
	/***********************************copyright@Nearguru************************************************************
	 * method -buy pack
	 * created date - 2nd  May 2015
	 * ******************************************************************************************/
	@RequestMapping(value = "/buyPack", method =RequestMethod.POST)	
	public String buyPack(ModelMap model,@ModelAttribute("CreditPack") CreditPack creditPack,HttpSession session){
		
		
		User user=null;
		if (session.getAttribute("user") != null) 
		{
			 user =  (User) session.getAttribute("user");
			
			model.addAttribute("user",user);
		}
		
		
		CreditBalance creditbalance=new CreditBalance();
		//creditbalance.se
		creditbalance.setBalanceCreditPoint(creditPack.getCreditPoint());
		creditbalance.setUserId(user.getUserId());
		creditbalance.setUserType(user.getUserType());
		creditbalance.setLastUpdatedDate(new Date());
		//this.creditPointService.buyPack();
		//this.cred.CreditPackSave(CreditPack);
		this.creditPointService.buyPack(creditbalance);
		model.addAttribute("creditPack", creditPack);
		//return "redirect:/bidService";
		 return "redirect:/prosDashboard";
	}
	@RequestMapping(value = "/admin/creditDetails", method = RequestMethod.GET)
	public String creditDetails(){
		
		return "creditDetails";
	 }
	}

