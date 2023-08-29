package com.ai.codegeneration.api.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transactions")
@Data
public class TransactionEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private Long userId;
    
    private Double paymentAmount;
    
    private LocalDateTime timestamp;
    
    private String cardLastFourDigits;
    
    @Column(columnDefinition = "varchar(255) default 'USD'")
    private String currency;
}
