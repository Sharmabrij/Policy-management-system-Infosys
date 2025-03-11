package com.example.policy.controller;

import com.example.policy.model.Policy;
import com.example.policy.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/policies")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    // Show the policy creation form
    @GetMapping("/create")
    public String showCreatePolicyForm(Model model) {
        model.addAttribute("policy", new Policy());
        return "policy_form"; // This should match the name of your HTML file
    }

    // Handle form submission to create a new policy
    @PostMapping("/create")
    public String createPolicy(@ModelAttribute Policy policy) {
        policyService.savePolicy(policy);
        return "redirect:/policies/list"; // Redirect to list page after creation
    }

    // Show all policies
    @GetMapping("/list")
    public String listPolicies(Model model) {
        List<Policy> policies = policyService.getAllPolicies();
        model.addAttribute("policies", policies);
        return "policy_list"; // This should be the name of your HTML file for listing policies
    }

    // View a specific policy
    @GetMapping("/{id}")
    public String viewPolicy(@PathVariable Long id, Model model) {
        Policy policy = policyService.getPolicyById(id);
        model.addAttribute("policy", policy);
        return "policy_details"; // This should match your HTML file for viewing a policy
    }

    // Delete a policy
    @GetMapping("/delete/{id}")
    public String deletePolicy(@PathVariable Long id) {
        policyService.deletePolicy(id);
        return "redirect:/policies/list";
    }
}
