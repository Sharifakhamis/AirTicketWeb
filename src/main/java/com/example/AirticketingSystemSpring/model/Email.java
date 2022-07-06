package com.example.AirticketingSystemSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table



public class Email {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long agentid;

    
    @Column(name = "email")
    private String  email;
    

    public void Admiin (long agentid,  String email) {
        this.agentid = agentid;
        this.email = email;
        
    }
    public long getAgentid() {
        return agentid;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
