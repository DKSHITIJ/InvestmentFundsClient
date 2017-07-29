package com.app1.investmentfundsclient;

//import org.jhades.JHades;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = { "com.app1" })
@EnableDiscoveryClient
public class InvestmentFundsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentFundsClientApplication.class, args);
		//new JHades().overlappingJarsReport();
	}
	
	 @Bean
	 @LoadBalanced
	 public RestTemplate restTemplate() {
	  return new RestTemplate();
	 }	
}
