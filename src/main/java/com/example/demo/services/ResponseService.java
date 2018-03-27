package com.example.demo.services;

import com.example.demo.dao.ForecastResponseRepository;
import com.example.demo.dao.WundergroundDao;
import com.example.demo.model.ForecastRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by UA C on 18.02.2018.
 */
@Service
public class ResponseService {
    @Autowired
    ForecastResponseRepository forecastResponseRepository;
    @Autowired
    WundergroundDao wundergroundDao;

    public void fetchResponse(ForecastRequest req) {
        switch (req.getType()){
            case FORECAST:forecastResponseRepository.save(wundergroundDao.getForecast(req));break;
            case FORECAST_ZIP:forecastResponseRepository.save(wundergroundDao.getForecastZip(req));break;
            case HISTORY:forecastResponseRepository.save(wundergroundDao.getHistory(req));break;
            case HISTORY_ZIP:forecastResponseRepository.save(wundergroundDao.getHistoryZip(req));break;
        }

    }
}
