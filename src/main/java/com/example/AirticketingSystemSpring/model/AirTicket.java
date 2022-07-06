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
@Table(name = "AirTicket")
public class AirTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="fnme")
    private String fnme;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="address")
     private String address;
     @Column(name="adults")
    private String adults;
    @Column(name="children")
    private String children;
    @Column(name="or_date")
    private String or_date;

    public AirTicket() {
    }

    public AirTicket(long id, String fnme, String email, String phone, String address, String adults, String children,
            String or_date) {
        this.id = id;
        this.fnme = fnme;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.adults = adults;
        this.children = children;
        this.or_date = or_date;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getOr_date() {
        return or_date;
    }

    public void setOr_date(String or_date) {
        this.or_date = or_date;
    }

    public AirTicket save(String airticket) {
        return null;
    }


    



    
    
}
