package com.ai.codegeneration.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ai.codegeneration.api.entity.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Long> {
    List<TransactionEntity> findAllByUserId(Long userId);
}
