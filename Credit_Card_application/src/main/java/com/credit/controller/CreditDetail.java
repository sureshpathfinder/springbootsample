package com.credit.controller;

import java.util.HashMap;
import java.util.Map;

public class CreditDetail {
	private Map<String, Double> creditDetail = new HashMap<String, Double>();

	public Map<String, Double> getCreditDetail() {
		return creditDetail;
	}

	public void setCreditDetail(Map<String, Double> creditDetail) {
		this.creditDetail = creditDetail;
	}

}
