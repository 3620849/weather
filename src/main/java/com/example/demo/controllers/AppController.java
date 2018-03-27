package com.example.demo.controllers;

import com.example.demo.model.ForecastRequest;
import com.example.demo.model.QueryType;
import com.example.demo.services.ForecastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by UA C on 18.02.2018.
 */
@RestController
@RequestMapping("/my-service")
public class AppController {
    @Autowired
    ForecastService forecastService;
    //days=3&state=CA&city=San_Francisco
    @RequestMapping(value = "/",params = {"action","days","state","city"})
    public ResponseEntity getForecast( @RequestParam("action")String action,
                                       @RequestParam("days")int days,
                                       @RequestParam("state")String state,
                                       @RequestParam("city")String city){
        if(!action.equals("getForecast"))return new ResponseEntity("bad request wrong action",HttpStatus.BAD_REQUEST);
        if(days>10)return new ResponseEntity("bad request",HttpStatus.BAD_REQUEST);
        if(days==0)return new ResponseEntity("bad request",HttpStatus.BAD_REQUEST);
        ForecastRequest forecastRequest = new ForecastRequest(days,state,city);
        if(days<0)forecastRequest.setType(QueryType.HISTORY);else forecastRequest.setType(QueryType.FORECAST);
        forecastService.storeForecastRequest(forecastRequest);
        return new ResponseEntity("first method OK", HttpStatus.OK);
    }
    //days=10&state=CA&city=San_Francisco
    @RequestMapping(value = "/",params = {"action","days","zipcode"})
    public ResponseEntity getForecast( @RequestParam("action")String action,
                                       @RequestParam("days")int days,
                                       @RequestParam("zipcode")String zipcode){
        if(!action.equals("getForecast"))return new ResponseEntity("bad request wrong action",HttpStatus.BAD_REQUEST);
        if(days>10)return new ResponseEntity("bad request days shoul be less or equals 10",HttpStatus.BAD_REQUEST);
        if(days==0)return new ResponseEntity("bad request 0 days",HttpStatus.BAD_REQUEST);
        ForecastRequest forecastRequest = new ForecastRequest(days,zipcode);
        if(days<0)forecastRequest.setType(QueryType.HISTORY_ZIP);else forecastRequest.setType(QueryType.FORECAST_ZIP);
        forecastService.storeForecastRequest(forecastRequest);
        return new ResponseEntity("second method OK", HttpStatus.OK);
    }
    //days=-4&zipcode=10007
    @RequestMapping(value = "/",params = {"action"})
    public ResponseEntity getForecast( @RequestParam("action")String action){
        if(!action.equals("run"))return new ResponseEntity("bad request wrong action",HttpStatus.BAD_REQUEST);
        return forecastService.run();
    }
}
