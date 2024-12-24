package com.jtc.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="policyDetails")
public class PolicyEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer policyId;
	
	private String  holderName;
	
	@Column(name = "email")
	private String holderEmail;
	@Column(name = "phone")
	private Long holderPhone;
	@Column(name = "age")
	private Integer holderAge;
	@Column(name = "gender")
	private String  holderGender;
	private String policyName;
	private String policyType;
	private Integer policyPremium;
	
	@CreationTimestamp
	private Date createdDate;
	
	

	@Override
	public String toString() {
		return "PolicyEntity [policyId=" + policyId + ", holderName=" + holderName + ", holderEmail=" + holderEmail
				+ ", holderPhone=" + holderPhone + ", holderAge=" + holderAge + ", holderGender=" + holderGender
				+ ", policyName=" + policyName + ", policyType=" + policyType + ", policyPremium=" + policyPremium
				+ ", createdDate=" + createdDate + "]";
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getHolderEmail() {
		return holderEmail;
	}

	public void setHolderEmail(String holderEmail) {
		this.holderEmail = holderEmail;
	}

	public Long getHolderPhone() {
		return holderPhone;
	}

	public void setHolderPhone(Long holderPhone) {
		this.holderPhone = holderPhone;
	}

	public Integer getHolderAge() {
		return holderAge;
	}

	public void setHolderAge(Integer holderAge) {
		this.holderAge = holderAge;
	}

	public String getHolderGender() {
		return holderGender;
	}

	public void setHolderGender(String holderGender) {
		this.holderGender = holderGender;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Integer getPolicyPremium() {
		return policyPremium;
	}

	public void setPolicyPremium(Integer policyPremium) {
		this.policyPremium = policyPremium;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
	
	
	
	
	
	

}
