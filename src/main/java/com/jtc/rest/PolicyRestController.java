package com.jtc.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jtc.entity.PolicyEntity;
import com.jtc.service.PolicyService;
import com.jtc.service.PolicyServiceImpl;

@RestController
@RequestMapping("api/policys")
public class PolicyRestController {

	@Autowired
	private PolicyService service;

	@GetMapping
	public ResponseEntity<List<PolicyEntity>> getAllrecord() {

		List<PolicyEntity> allPolicys = service.getAllPolicys();

		return new ResponseEntity<>(allPolicys, HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<PolicyEntity> createPolicy(@RequestBody PolicyEntity entity) {

		PolicyEntity Createpolicy = service.createPolicy(entity);

		return new ResponseEntity<PolicyEntity>(Createpolicy, HttpStatus.CREATED);

	}

	@GetMapping("/{policyId}")
	public ResponseEntity<PolicyEntity> getPolicyById(@PathVariable Integer policyId) {

		PolicyEntity policyById = service.getPolicyById(policyId);

		return new ResponseEntity<PolicyEntity>(policyById, HttpStatus.OK);

	}

	@PutMapping("/{policyId}")
	public ResponseEntity<PolicyEntity> updatePolicyById(@PathVariable Integer policyId,
			@RequestBody PolicyEntity entity) {

		// existing record not delete at the time of updation

		PolicyEntity existPolicy = service.getPolicyById(policyId);

		if (entity.getPolicyName() != null) {

			existPolicy.setPolicyName(entity.getPolicyName());
		}

		if (entity.getPolicyType() != null) {

			existPolicy.setPolicyType(entity.getPolicyType());
		}

		if (entity.getPolicyPremium() != null) {

			existPolicy.setPolicyPremium(entity.getPolicyPremium());
		}

		if (entity.getHolderEmail() != null) {
			existPolicy.setHolderEmail(entity.getHolderEmail());
		}

		if (entity.getHolderAge() != null) {
			existPolicy.setHolderAge(entity.getHolderAge());
		}

		if (entity.getHolderGender() != null) {
			existPolicy.setHolderGender(entity.getHolderGender());
		}

		if (entity.getHolderPhone() != null) {
			existPolicy.setHolderPhone(entity.getHolderPhone());
		}

		PolicyEntity updatePolicy = service.updatePolicy(policyId, existPolicy);

		return new ResponseEntity<PolicyEntity>(updatePolicy, HttpStatus.OK);

	}

	@DeleteMapping("/{policyId}")
	public ResponseEntity<PolicyEntity> deletePolicyById(@PathVariable Integer policyId) {

		service.deletePolicy(policyId);

		return new ResponseEntity<PolicyEntity>(HttpStatus.NO_CONTENT);

	}

}
