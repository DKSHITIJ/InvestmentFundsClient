package com.app1.investmentfundsclient.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app1.domain.Fund;

@Path("/fundsserviceclient")
@Produces(MediaType.APPLICATION_JSON)
public interface InvestmentFundsClientService {
	@GET
	@Path("/totalfunds")
	public List<Fund> getTotalFunds() ;
}
