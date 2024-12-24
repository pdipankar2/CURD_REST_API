package com.jtc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jtc.entity.PolicyEntity;

@Repository
public interface PolicyRepo extends JpaRepository<PolicyEntity, Integer> {

}
