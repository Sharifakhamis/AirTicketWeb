package com.example.AirticketingSystemSpring.repository;

import com.example.AirticketingSystemSpring.model.AirTicket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AirTicketRepository  extends JpaRepository<AirTicket,Long>{
    
}
