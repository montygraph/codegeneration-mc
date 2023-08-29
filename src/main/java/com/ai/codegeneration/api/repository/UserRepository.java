package com.ai.codegeneration.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ai.codegeneration.api.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
