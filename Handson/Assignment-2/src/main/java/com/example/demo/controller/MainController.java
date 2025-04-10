package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Branch;
import com.example.demo.model.Service;

@Controller
public class MainController {
	
	 private static List<Branch> branches = new ArrayList<Branch>();
	   static {
	        branches.add(new Branch("1", "BANGALORE - KASTURBA GANDHI MARG"));
	        branches.add(new Branch("2", "BANGALORE - KORAMANGALA"));
	        branches.add(new Branch("3", "BANGALORE - M G ROAD"));
	        branches.add(new Branch("4", "BANGALORE - MALLESWARAM"));
	        branches.add(new Branch("5", "BANGALORE - AIRPORT ROAD"));
	        branches.add(new Branch("6", "BANGALORE - IT PARK"));
	        branches.add(new Branch("7", "BANGALORE - J P NAGAR"));
	        branches.add(new Branch("8", "BANGALORE - R T NAGAR"));
	        branches.add(new Branch("9", " BANGALORE - BANASHANKARI"));
	        branches.add(new Branch("10", "BANGALORE - INDIRA NAGAR"));
	        
	    }
	   
	   private static List<Service> services = new ArrayList<Service>();
	   static {
		   services.add(new Service("1", "Credit Card"));
		   services.add(new Service("2", "Home Loan"));
		   services.add(new Service("3", "Mutual Funds"));
		   services.add(new Service("4", "Trade Services"));
		   services.add(new Service("5", "Cheque Deposits"));
		   services.add(new Service("6", "Travellers Cheques"));
		   services.add(new Service("7", "personal Loan"));
		   services.add(new Service("8", "Foreign Currency Cash"));
		   services.add(new Service("9", "Foreign Currency Demand Drafts"));
		   services.add(new Service("10", "Remittances"));
	        
	    }
	   @Value("${welcome.message}")
	    private String message;
	   @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	    public String index(Model model) {
	 
	        model.addAttribute("message", message);
	 
	        return "index";
	    }
	   
	   @RequestMapping(value = { "/branchList" }, method = RequestMethod.GET)
	    public String branchList(Model model) {
	 
	        model.addAttribute("branches", branches);
	 
	        return "branchList";
	    }
	   
	   @RequestMapping(value = { "/serviceList" }, method = RequestMethod.GET)
	    public String serviceList(Model model1) {
	 
	        model1.addAttribute("services", services);
	 
	        return "serviceList";
	    }

}
