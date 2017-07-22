package com.app1.InvestmentFundsClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = { "com.app1" })
@EnableDiscoveryClient
public class InvestmentFundsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentFundsClientApplication.class, args);
	}
}
