package com.example.policy.controller;

import com.example.policy.model.Payment;
import com.example.policy.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/make")
    public String showPaymentForm() {
        return "payments";
    }

    @PostMapping("/process")
    public String processPayment(@RequestParam Long policyId, @RequestParam Long customerId, @RequestParam double amount, Model model) {
        Payment payment = new Payment();
        payment.setPolicyId(policyId);
        payment.setCustomerId(customerId);
        payment.setAmount(amount);
        paymentService.processPayment(payment);

        model.addAttribute("message", "Payment Successful!");
        return "redirect:/payments/make";
    }
}
