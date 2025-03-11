package com.example.policy.service;

import com.example.policy.model.Policy;
import com.example.policy.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public void savePolicy(Policy policy) {
        policyRepository.save(policy);
    }

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public Policy getPolicyById(Long id) {
        Optional<Policy> policy = policyRepository.findById(id);
        return policy.orElse(null);
    }

    public void deletePolicy(Long id) {
        policyRepository.deleteById(id);
    }
}
