package com.example.demo.dao;

import com.example.demo.model.ForecastRequest;
import com.example.demo.model.ForecastResponse;
import com.example.demo.model.wundergroundDtos.ForecastDto;
import com.example.demo.model.wundergroundDtos.historicalDtos.HistoryDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@Component
public class WundergroundDao {
    final String key ;
    RestTemplate restTemplate;
    WundergroundDao(@Value("${wunderground.key}")String key,RestTemplateBuilder restTemplateBuilder ){
        this.restTemplate=restTemplateBuilder.build();
        this.key = key;
    }

    public ForecastResponse getForecast(ForecastRequest req) {
        String url = "http://api.wunderground.com/api/"+key+"/forecast10day/q/"+req.getState()+"/"+req.getCity()+".json";
        ForecastDto response = restTemplate.getForObject(url, ForecastDto.class);
        if(response.getForecast()==null)return new ForecastResponse("Error",req);
        return new ForecastResponse(response,req);
    }

    public ForecastResponse getForecastZip(ForecastRequest q) {
        String url = "http://api.wunderground.com/api/" + key + "/forecast10day/q/" + q.getZipcode() + ".json";
        ForecastDto response = restTemplate.getForObject(url, ForecastDto.class);
        if(response.getForecast()==null){ return new ForecastResponse("Error",q);}
        return new ForecastResponse(response, q);
    }

    public ForecastResponse getHistory(ForecastRequest q) {

        String url = "http://api.wunderground.com/api/" + key + "/history_" + getDateForUrl(q) + "/q/" + q.getState() + "/" + q.getCity() + ".json";

        HistoryDto response = restTemplate.getForObject(url, HistoryDto.class);
        if(response.getHistory()==null){ return new ForecastResponse("Error",q);}
        return new ForecastResponse(response, q);
    }

    public ForecastResponse getHistoryZip(ForecastRequest q) {
        String url = "http://api.wunderground.com/api/" + key + "/history_" + getDateForUrl(q) + "/q/" + q.getZipcode() + ".json";
        HistoryDto response = restTemplate.getForObject(url, HistoryDto.class);
        if(response.getHistory()==null){ return new ForecastResponse("Error",q);}
        return new ForecastResponse(response, q);
    }

    private String getDateForUrl(ForecastRequest q) {
        LocalDate now = LocalDate.now();
        LocalDate querytime = now.minusDays(Long.parseLong("" + q.getDays() * -1));
        int month = querytime.getMonth().getValue();
        String monthValue = null;
        if (month < 10) {
            monthValue = "0" + month;
        }
        int day = querytime.getDayOfMonth();
        String dayValue = null;
        if (day < 10) {
            dayValue = "0" + day;
        }
        String date = "" + querytime.getYear() + monthValue + dayValue;
        return date;
    }
}
