package com.twiteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twiteroo.api.model.User;

public interface UserRepository extends JpaRepository <User, Long> {
    
}
