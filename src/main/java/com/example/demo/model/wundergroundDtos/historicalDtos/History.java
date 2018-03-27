
package com.example.demo.model.wundergroundDtos.historicalDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "utcdate",
    "observations",
    "dailysummary"
})
public class History {

    @JsonProperty("date")
    private Date date;
    @JsonProperty("utcdate")
    private Utcdate utcdate;
    @JsonProperty("observations")
    private List<Observation> observations = null;
    @JsonProperty("dailysummary")
    private List<Dailysummary> dailysummary = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    @JsonProperty("utcdate")
    public Utcdate getUtcdate() {
        return utcdate;
    }

    @JsonProperty("utcdate")
    public void setUtcdate(Utcdate utcdate) {
        this.utcdate = utcdate;
    }

    @JsonProperty("observations")
    public List<Observation> getObservations() {
        return observations;
    }

    @JsonProperty("observations")
    public void setObservations(List<Observation> observations) {
        this.observations = observations;
    }

    @JsonProperty("dailysummary")
    public List<Dailysummary> getDailysummary() {
        return dailysummary;
    }

    @JsonProperty("dailysummary")
    public void setDailysummary(List<Dailysummary> dailysummary) {
        this.dailysummary = dailysummary;
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
