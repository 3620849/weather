
package com.example.demo.model.wundergroundDtos.historicalDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "history"
})
public class Features {

    @JsonProperty("history")
    private Integer history;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("history")
    public Integer getHistory() {
        return history;
    }

    @JsonProperty("history")
    public void setHistory(Integer history) {
        this.history = history;
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
