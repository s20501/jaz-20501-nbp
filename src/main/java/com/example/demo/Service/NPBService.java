package com.example.demo.Service;

import com.example.demo.Model.AverageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NPBService {

    private RestTemplate restTemplate;

    public NPBService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public Double getAverage(String currency, String startDate, String endDate){
        String url = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" + startDate + "/" + endDate;

        AverageRequest averageRequest = restTemplate.getForObject(url,AverageRequest.class);

        return  averageRequest.getRates().stream().mapToDouble(r -> r.mid).average().orElse(-1.0d);


    }
}
