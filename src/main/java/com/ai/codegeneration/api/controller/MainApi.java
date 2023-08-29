package com.ai.codegeneration.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ai.codegeneration.api.entity.TransactionEntity;
import com.ai.codegeneration.api.model.PaymentRequest;
import com.ai.codegeneration.api.service.PaymentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@Tag(name = "Payment and Transaction API", description = "Payment and Transaction API")
@RequiredArgsConstructor
public class MainApi {
    

    final PaymentService paymentService;
    
    @Operation(
        summary = "Initiate a payment", 
        description = "Allows users to initiate a payment by providing the payment amount and credit/debit card details.",
        requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
            description = "Payment Request",
            required = true,
            content = @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = PaymentRequest.class),
                examples = @ExampleObject(value = "{\n  \"paymentAmount\": 250.00,\n  \"cardNumber\": \"5555 1234 5678 9012\",\n  \"expiryDate\": \"10/28\",\n  \"cvv\": \"662\"\n}")
            )
        )
    )
    @PostMapping("/payments/initiate")
    public ResponseEntity<String> initiatePayment(@RequestBody PaymentRequest paymentRequest) {
        return paymentService.initiatePayment(paymentRequest);
    }
    
    @Operation(
        summary = "Get transaction history", 
        description = "Retrieves the transaction history for the authenticated user, including details like transaction amount, timestamp, and status.",
        parameters = {
            @Parameter(name = "userId", description = "The ID of the user whose transaction history is to be retrieved", required = true, example="123456")
        }
    )
    @GetMapping("/transactions/history")
    public ResponseEntity<List<TransactionEntity>> getTransactionHistory(@RequestParam Long userId) {
        // Implement the transaction history retrieval logic here
        List<TransactionEntity> transactionHistory = paymentService.retrieveTransactionHistory(userId);
        return new ResponseEntity<>(transactionHistory, HttpStatus.OK);
    }
}
