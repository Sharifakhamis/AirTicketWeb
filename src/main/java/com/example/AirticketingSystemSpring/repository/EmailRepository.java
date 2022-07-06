package com.example.AirticketingSystemSpring.repository;

import com.example.AirticketingSystemSpring.model.Email;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository  extends JpaRepository<Email,Long>{
    
}
