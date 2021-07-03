package com.example.demo.Model;

import javax.persistence.*;
import java.util.List;

public class AverageRequest {


    private Long id;

    private String table;
    private String currency;
    private String startDate;
    private String endDate;


    private List<Rate> rates;

    public AverageRequest(Long id, String table, String currency, String startDate, String endDate, List<Rate> rates) {
        this.id = id;
        this.table = table;
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rates = rates;
    }

    public AverageRequest(String table, String currency, String startDate, String endDate, List<Rate> rates) {
        this.table = table;
        this.currency = currency;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rates = rates;
    }

    public AverageRequest() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
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

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
}
