package com.example.policy.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "policies")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private double totalPremiumAmount;
    private double maturityAmount;
    private int numYears;
    private String policyStatus;
    private String annuityTerm;
    private Long policyId;
    private Long customerId;
    private Long SchemeId;

    public Policy() {}

    public Policy(LocalDate startDate, double totalPremiumAmount, double maturityAmount, int numYears, String policyStatus, String annuityTerm) {
        this.startDate = startDate;
        this.totalPremiumAmount = totalPremiumAmount;
        this.maturityAmount = maturityAmount;
        this.numYears = numYears;
        this.policyStatus = policyStatus;
        this.annuityTerm = annuityTerm;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getSchemeId() { return SchemeId; }
    public void setSchemeId(Long SchemeId) { this.SchemeId = SchemeId; }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public double getTotalPremiumAmount() {
        return totalPremiumAmount;
    }

    public void setTotalPremiumAmount(double totalPremiumAmount) {
        this.totalPremiumAmount = totalPremiumAmount;
    }

    public double getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(double maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    public int getNumYears() {
        return numYears;
    }

    public void setNumYears(int numYears) {
        this.numYears = numYears;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getAnnuityTerm() {
        return annuityTerm;
    }

    public void setAnnuityTerm(String annuityTerm) {
        this.annuityTerm = annuityTerm;
    }
    public Long getPolicyId() { return policyId; }
    public void setPolicyId(Long policyId) { this.policyId = policyId; }

    public Long getCustomerId() { return customerId; }
    public void setCustomerId(Long customerId) { this.customerId = customerId; }
}
