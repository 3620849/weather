
package com.example.demo.model.wundergroundDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "in",
    "cm"
})
public class SnowDay {

    @JsonProperty("in")
    private Double in;
    @JsonProperty("cm")
    private Double cm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("in")
    public Double getIn() {
        return in;
    }

    @JsonProperty("in")
    public void setIn(Double in) {
        this.in = in;
    }

    @JsonProperty("cm")
    public Double getCm() {
        return cm;
    }

    @JsonProperty("cm")
    public void setCm(Double cm) {
        this.cm = cm;
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
