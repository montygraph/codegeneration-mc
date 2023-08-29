package com.ai.codegeneration.api.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Entity
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
