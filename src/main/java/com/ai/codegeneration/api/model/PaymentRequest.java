package com.ai.codegeneration.api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.SchemaProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name="PaymentRequest", description = "Payment Request")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public final class PaymentRequest {

    @SchemaProperty(name = "Payment amount")
    private double paymentAmount;
    
    @SchemaProperty(name = "Card number")
    @NotBlank
    private String cardNumber;
    
    @SchemaProperty(name = "Expiry date")
    private String expiryDate;
    
    @SchemaProperty(name = "CVV")
    private String cvv;
}

