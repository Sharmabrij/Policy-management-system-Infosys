package com.example.policy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.policy.model.Policy;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/policies")
public class PolicyController {

    private final List<Policy> policyList = new ArrayList<>();

    @GetMapping("/form")
    public String showPolicyForm(Model model) {
        model.addAttribute("policy", new Policy());
        return "policy_form";
    }

    @PutMapping("/create")
    public String createPolicy(@ModelAttribute Policy policy, Model model) {
        policy.setId((long) (policyList.size() + 1)); // Assign ID
        policyList.add(policy);
        model.addAttribute("message", "Policy Created Successfully!");
        return "policy_success";
    }

    @GetMapping("/view")
    public String viewPolicies(Model model) {
        model.addAttribute("policies", policyList);
        return "policy_list";
    }
}
