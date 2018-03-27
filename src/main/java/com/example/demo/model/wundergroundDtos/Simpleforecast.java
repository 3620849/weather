
package com.example.demo.model.wundergroundDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "forecastday"
})
public class Simpleforecast {

    @JsonProperty("forecastday")
    private List<Forecastday_> forecastday = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("forecastday")
    public List<Forecastday_> getForecastday() {
        return forecastday;
    }

    @JsonProperty("forecastday")
    public void setForecastday(List<Forecastday_> forecastday) {
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
