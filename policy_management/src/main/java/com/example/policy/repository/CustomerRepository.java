package com.example.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.policy.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
