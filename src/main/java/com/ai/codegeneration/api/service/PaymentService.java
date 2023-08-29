package com.ai.codegeneration.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ai.codegeneration.api.entity.TransactionEntity;
import com.ai.codegeneration.api.mapper.PaymentToTransactionMapper;
import com.ai.codegeneration.api.model.PaymentRequest;
import com.ai.codegeneration.api.repository.TransactionRepository;

@Service
public class PaymentService {

    @Autowired
    TransactionRepository transactionRepository;
    
    public ResponseEntity<String> initiatePayment(PaymentRequest paymentRequest) {
        // Set paymentRequest properties        
        TransactionEntity transactionEntity = PaymentToTransactionMapper.mapPaymentRequestToTransactionEntity(paymentRequest);
        
        try {
            // Code to store the transactionEntity in the database using TransactionRepository
            transactionRepository.save(transactionEntity);
            
            // Return success response
            return new ResponseEntity<>("Payment initiated", HttpStatus.OK);
        } catch (Exception e) {
            // Return error response
            return new ResponseEntity<>("Error initiating payment", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    public List<TransactionEntity> retrieveTransactionHistory(Long userId) {
        // Code to retrieve transaction history
        return transactionRepository.findAllByUserId(userId);
    }
}
