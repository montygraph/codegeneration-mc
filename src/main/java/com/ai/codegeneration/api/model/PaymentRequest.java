package com.ai.codegeneration.api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import lombok.Data;

@Data
@Schema(description = "Payment Request")
public class PaymentRequest {
    @SchemaProperty(name = "Payment amount")
    private double paymentAmount;
    
    @SchemaProperty(name = "Card number")
    private String cardNumber;
    
    @SchemaProperty(name = "Expiry date")
    private String expiryDate;
    
    @SchemaProperty(name = "CVV")
    private String cvv;
}

