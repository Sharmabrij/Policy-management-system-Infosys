package com.example.policy.service;

import com.example.policy.model.Policy;
import com.example.policy.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy getPolicyById(Long id) {
        return policyRepository.findById(id).orElse(null);
    }

    public Policy savePolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    public void deletePolicy(Long id) {
        policyRepository.deleteById(id);
    }
}
