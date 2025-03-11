package com.example.policy.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "policies")
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String policyId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "scheme_id", nullable = false)
    private Scheme scheme;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Double totalPremiumAmount;

    @Column(nullable = false)
    private Double maturityAmount;

    @Column(nullable = false)
    private Integer numberOfYears;

    @Column(nullable = false)
    private String policyStatus; // Active / Deactivated

    @Column(nullable = false)
    private String annuityTerm; // Yearly / Monthly

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPolicyId() { return policyId; }
    public void setPolicyId(String policyId) { this.policyId = policyId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Scheme getScheme() { return scheme; }
    public void setScheme(Scheme scheme) { this.scheme = scheme; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Double getTotalPremiumAmount() { return totalPremiumAmount; }
    public void setTotalPremiumAmount(Double totalPremiumAmount) { this.totalPremiumAmount = totalPremiumAmount; }

    public Double getMaturityAmount() { return maturityAmount; }
    public void setMaturityAmount(Double maturityAmount) { this.maturityAmount = maturityAmount; }

    public Integer getNumberOfYears() { return numberOfYears; }
    public void setNumberOfYears(Integer numberOfYears) { this.numberOfYears = numberOfYears; }

    public String getPolicyStatus() { return policyStatus; }
    public void setPolicyStatus(String policyStatus) { this.policyStatus = policyStatus; }

    public String getAnnuityTerm() { return annuityTerm; }
    public void setAnnuityTerm(String annuityTerm) { this.annuityTerm = annuityTerm; }
}
