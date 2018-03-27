package com.example.demo.model;

import com.example.demo.model.wundergroundDtos.ForecastDto;
import com.example.demo.model.wundergroundDtos.historicalDtos.HistoryDto;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
 @Data
 @NoArgsConstructor
 @Document
public class ForecastResponse {
    @Id
    String id;
    boolean printed = false;
    List<DailyForecast> response = new ArrayList<>();
    public ForecastResponse(ForecastDto forecastDto, ForecastRequest q){
        for(int i=0;i<q.getDays();++i){
            int day = forecastDto.getForecast()
                    .getSimpleforecast().getForecastday().get(i).getDate().getDay();

            int month = forecastDto.getForecast()
                    .getSimpleforecast().getForecastday().get(i).getDate().getMonth();
            int year = forecastDto.getForecast()
                    .getSimpleforecast().getForecastday().get(i).getDate().getYear();
            String temperature = forecastDto.getForecast()
                    .getSimpleforecast().getForecastday().get(i).getHigh().getCelsius();
            String description = forecastDto.getForecast().getTxtForecast().getForecastday().get(i*2).getFcttext();
            DailyForecast forecast = new DailyForecast();
            forecast.setMax_tempertature(temperature);
            forecast.setWeather_description(description);
            forecast.setDate(day+"-"+month+"-"+year);
            this.response.add(forecast);
        }
    }

    public ForecastResponse(HistoryDto historyDto, ForecastRequest q) {
        String day = historyDto.getHistory().getDate().getMday();
        String month = historyDto.getHistory().getDate().getMon();
        String year = historyDto.getHistory().getDate().getYear();

        String temperature = historyDto.getHistory().getDailysummary().get(0).getMaxdewptm();
        DailyForecast forecast = new DailyForecast();
        forecast.setMax_tempertature(temperature);
        forecast.setWeather_description("No description for histroy reports");
        forecast.setDate(day+"-"+month+"-"+year);
        this.response.add(forecast);
    }
    public ForecastResponse(String error, ForecastRequest q){
        DailyForecast forecast = new DailyForecast();
        forecast.setWeather_description(error);
        this.response.add(forecast);
    }
}
