package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Rate {


    private Long id;

    public String no;
    public String effectiveDate;
    public double mid;

    public Rate(String no, String effectiveDate, double mid) {
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    public Rate(Long id, String no, String effectiveDate, double mid) {
        this.id = id;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    public Rate() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }
}
