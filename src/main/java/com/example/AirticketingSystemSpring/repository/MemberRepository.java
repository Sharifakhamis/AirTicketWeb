package com.example.AirticketingSystemSpring.repository;

import com.example.AirticketingSystemSpring.model.Member;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
    
}
