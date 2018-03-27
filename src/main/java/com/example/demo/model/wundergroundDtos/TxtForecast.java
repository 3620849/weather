
package com.example.demo.model.wundergroundDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "forecastday"
})
public class TxtForecast {

    @JsonProperty("date")
    private String date;
    @JsonProperty("forecastday")
    private List<Forecastday> forecastday = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("forecastday")
    public List<Forecastday> getForecastday() {
        return forecastday;
    }

    @JsonProperty("forecastday")
    public void setForecastday(List<Forecastday> forecastday) {
        this.forecastday = forecastday;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
