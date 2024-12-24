package com.jtc.service;

import java.util.List;

import com.jtc.entity.PolicyEntity;

public interface PolicyService {
	
	public List<PolicyEntity> getAllPolicys();
	
	public PolicyEntity createPolicy(PolicyEntity entity);
	
	public PolicyEntity getPolicyById(Integer policyId);
	
	public PolicyEntity updatePolicy(Integer policyId,PolicyEntity entity);
	
	public void   deletePolicy(Integer policyId);
	
	
	

}
