package com.jtc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.jtc.PolicyRepo;
import com.jtc.entity.PolicyEntity;

@Service
//@Primary
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyRepo policyRepo;

	@Override
	public List<PolicyEntity> getAllPolicys() {

		List<PolicyEntity> getAll = policyRepo.findAll();

		return getAll;
	}

	@Override
	public PolicyEntity createPolicy(PolicyEntity entity) {

		PolicyEntity create = policyRepo.save(entity);

		return create;
	}

	@Override
	public PolicyEntity getPolicyById(Integer policyId) {

		PolicyEntity PolicyById = policyRepo.findById(policyId)
				.orElseThrow(() -> new RuntimeException("Plicy not Found"));

		return PolicyById;
	}

	@Override
	public PolicyEntity updatePolicy(Integer policyId, PolicyEntity entity) {

		Optional<PolicyEntity> policy = policyRepo.findById(policyId);

		if (policy.isPresent()) {

			PolicyEntity updatepolicy = policy.get();
			updatepolicy.setPolicyName(entity.getPolicyName());
			updatepolicy.setHolderName(entity.getHolderName());
			updatepolicy.setHolderAge(entity.getHolderAge());
			updatepolicy.setHolderEmail(entity.getHolderEmail());
			updatepolicy.setHolderGender(entity.getHolderGender());
			updatepolicy.setHolderPhone(entity.getHolderPhone());
			updatepolicy.setPolicyPremium(entity.getPolicyPremium());
			updatepolicy.setPolicyType(entity.getPolicyType());

			return policyRepo.save(updatepolicy);

		} else {
			return null;
		}

	}

	@Override
	public void deletePolicy(Integer policyId) {

		policyRepo.deleteById(policyId);

	}

}
