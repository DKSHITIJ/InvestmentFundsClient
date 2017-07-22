package com.app1.investmentfundsclient.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ApplicationPath("/v1")
public class JerseyConfig extends ResourceConfig {
	@Autowired
	  public JerseyConfig() {
	    packages("com.app1.investmentfundsclient");
	  }
}
