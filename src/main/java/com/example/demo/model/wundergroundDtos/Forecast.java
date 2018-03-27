
package com.example.demo.model.wundergroundDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "txt_forecast",
    "simpleforecast"
})
public class Forecast {

    @JsonProperty("txt_forecast")
    private TxtForecast txtForecast;
    @JsonProperty("simpleforecast")
    private Simpleforecast simpleforecast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("txt_forecast")
    public TxtForecast getTxtForecast() {
        return txtForecast;
    }

    @JsonProperty("txt_forecast")
    public void setTxtForecast(TxtForecast txtForecast) {
        this.txtForecast = txtForecast;
    }

    @JsonProperty("simpleforecast")
    public Simpleforecast getSimpleforecast() {
        return simpleforecast;
    }

    @JsonProperty("simpleforecast")
    public void setSimpleforecast(Simpleforecast simpleforecast) {
        this.simpleforecast = simpleforecast;
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
