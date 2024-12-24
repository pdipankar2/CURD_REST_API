package com.jtc.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.jtc.service.PolicyService;
import com.jtc.service.PolicyServiceImpl;

@Configuration
public class PlolicyServiceFactory {

	@Bean
	@Primary
	public PolicyService policyServiceFactory(PolicyServiceImpl serviceImpl) {
		
		return serviceImpl;
	}
}
