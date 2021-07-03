package com.example.demo.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NPBService {

    private RestTemplate restTemplate;

    public NPBService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Double getAverage(String currency, String startDate, String endDate){


        return 0.5d;
    }
}
