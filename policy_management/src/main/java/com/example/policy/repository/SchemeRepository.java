package com.example.policy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.policy.model.Scheme;

public interface SchemeRepository extends JpaRepository<Scheme, Long> {
}
