package com.example.demo.Service;

import com.example.demo.Model.AverageRequest;
import com.example.demo.Model.Log;
import com.example.demo.Repository.LogRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Service
public class NPBService {

    private RestTemplate restTemplate;

    private final LogRepository logRepository;

    public NPBService(RestTemplate restTemplate,LogRepository logRepository){
        this.restTemplate = restTemplate;
        this.logRepository = logRepository;
    }

    public Double getAverage(String currency, String startDate, String endDate){
        String url = "http://api.nbp.pl/api/exchangerates/rates/a/" + currency + "/" + startDate + "/" + endDate;

        AverageRequest averageRequest = restTemplate.getForObject(url,AverageRequest.class);

        Double response =  averageRequest.getRates().stream().mapToDouble(r -> r.mid).average().orElse(-1.0d);
        Log log = new Log(currency,startDate,endDate,new Date().toString(),response);
        logRepository.save(log);

        return response;


    }
}
