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
public class Admiin{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long agentid;
    @Column(name ="username")
    private String username;
    @Column(name = "email")
    private String  email;
    @Column(name = "pasword")
    private String pasword;
    
    
    public Admiin(long agentid, String username, String email, String pasword) {
        this.agentid = agentid;
        this.username = username;
        this.email = email;
        this.pasword = pasword;
    }


    public long getAgentid() {
        return agentid;
    }


    public void setAgentid(long agentid) {
        this.agentid = agentid;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPasword() {
        return pasword;
    }


    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    }

    


   
   
    

