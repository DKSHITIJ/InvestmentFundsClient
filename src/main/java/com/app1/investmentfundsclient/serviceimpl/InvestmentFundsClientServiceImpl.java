package com.app1.investmentfundsclient.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.app1.domain.Fund;
import com.app1.investmentfundsclient.service.InvestmentFundsClientService;

@Component
 public class InvestmentFundsClientServiceImpl implements InvestmentFundsClientService{

	public static final String INVESTMENTFUNDS_SERVICE_URL = "http://INVESTMENTFUNDS-SERVICE";
	@Autowired
	 protected RestTemplate restTemplate;
	
	public List<Fund> getTotalFunds() {
		System.out.print("I am here");
		 Fund[] funds = restTemplate.getForObject(INVESTMENTFUNDS_SERVICE_URL, Fund[].class);
		  return Arrays.asList(funds);
	}

}
