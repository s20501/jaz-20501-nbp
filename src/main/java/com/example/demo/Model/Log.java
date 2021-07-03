package com.example.demo.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String currency;
    private String startDate;
    private String endDate;
    private String requestDate;
    private Double rate;

    public Log(String currency, String startDate, String endDate, String requestDate, Double rate) {
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.requestDate = requestDate;
        this.rate = rate;
    }

    public Log(Long id, String currency, String startDate, String endDate, String requestDate, Double rate) {
        this.id = id;
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.requestDate = requestDate;
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }
}
