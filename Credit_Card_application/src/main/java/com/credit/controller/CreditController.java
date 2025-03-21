package com.credit.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class CreditController {
	private static Map<String, Double> creditScore = new HashMap<String, Double>();
	static {
		creditScore.put("AXSSP1122H", 3.10);
		creditScore.put("APPSA3355P", 8.50);
		creditScore.put("APPXA2244X", 9.50);
		creditScore.put("AXVPS7766V", 1.50);
		creditScore.put("ASXPS2121S", 5.10);		
	}	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String indexPage()
	{
		return "index";
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/checkEligibility",method = RequestMethod.POST)
	public String printEligible(@RequestParam("panNo") String pan_no) {
		String view="";
		Set set = creditScore.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry credit = (Map.Entry)iterator.next();
		   if(pan_no.equalsIgnoreCase((String)credit.getKey()))
				{
			   double credit_score=(double) credit.getValue();
			   if(credit_score>=5)
			   
			   {
				   view="eligible";
				   break;
			   }
			   else if (credit_score<5)
			   {
				   view="noteligible"; 
				   break;
			   }
		     }
		
		else 
		{
			view="invalid";
		}
		
	}
	      return view;
}
}
