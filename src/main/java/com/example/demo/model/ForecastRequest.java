package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by UA C on 18.02.2018.
 */
@Document
@Data
@NoArgsConstructor
public class ForecastRequest {
    @Id
    String id;
    int days;
    String state;
    String city;
    String zipcode;
    QueryType type;
    boolean executed =false;
    @Version
    Long version;

    public ForecastRequest(int days, String state, String city) {
        this.days = days;
        this.state =state;
        this.city = city;
    }

    public ForecastRequest(int days, String zipcode) {
        this.days = days;
        this.zipcode = zipcode;
    }
}
