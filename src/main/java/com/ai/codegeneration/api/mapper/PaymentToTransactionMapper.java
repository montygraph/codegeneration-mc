package com.ai.codegeneration.api.mapper;

import java.time.LocalDateTime;

import com.ai.codegeneration.api.entity.TransactionEntity;
import com.ai.codegeneration.api.model.PaymentRequest;

public class PaymentToTransactionMapper {
    
    public static TransactionEntity mapPaymentRequestToTransactionEntity(PaymentRequest paymentRequest) {
        TransactionEntity transactionEntity = new TransactionEntity();
        transactionEntity.setPaymentAmount(paymentRequest.getPaymentAmount());
        transactionEntity.setCardLastFourDigits(paymentRequest.getCardNumber().substring(paymentRequest.getCardNumber().length() - 4));
        transactionEntity.setTimestamp(LocalDateTime.now());
        transactionEntity.setCurrency("USD");
        // Set default value for userId
        transactionEntity.setUserId(123456L);
        return transactionEntity;
    }
}
