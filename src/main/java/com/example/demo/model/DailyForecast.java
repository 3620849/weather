package com.example.demo.model;

import lombok.Data;

/**
 * Created by UA C on 18.02.2018.
 */
@Data
public class DailyForecast {
    String date;
    String weather_description;
    String max_tempertature;
}
