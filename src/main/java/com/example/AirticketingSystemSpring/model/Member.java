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
@Table(name = "Member")
public class Member{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "fname")
    private String fnme;

    @Column(name = "lname")
    private String lname;

    @Column(name = "Gender")
    private String Gender;
    
    public Member() {
    }
    public Member(long id, String fnme, String lname, String gender) {
        this.id = id;
        this.fnme = fnme;
        this.lname = lname;
        Gender = gender;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFnme() {
        return fnme;
    }
    public void setFnme(String fnme) {
        this.fnme = fnme;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getGender() {
        return Gender;
    }
    public void setGender(String gender) {
        Gender = gender;
    }
    
}