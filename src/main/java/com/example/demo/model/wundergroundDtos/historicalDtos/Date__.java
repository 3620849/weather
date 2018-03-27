
package com.example.demo.model.wundergroundDtos.historicalDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pretty",
    "year",
    "mon",
    "mday",
    "hour",
    "min",
    "tzname"
})
public class Date__ {

    @JsonProperty("pretty")
    private String pretty;
    @JsonProperty("year")
    private String year;
    @JsonProperty("mon")
    private String mon;
    @JsonProperty("mday")
    private String mday;
    @JsonProperty("hour")
    private String hour;
    @JsonProperty("min")
    private String min;
    @JsonProperty("tzname")
    private String tzname;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pretty")
    public String getPretty() {
        return pretty;
    }

    @JsonProperty("pretty")
    public void setPretty(String pretty) {
        this.pretty = pretty;
    }

    @JsonProperty("year")
    public String getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(String year) {
        this.year = year;
    }

    @JsonProperty("mon")
    public String getMon() {
        return mon;
    }

    @JsonProperty("mon")
    public void setMon(String mon) {
        this.mon = mon;
    }

    @JsonProperty("mday")
    public String getMday() {
        return mday;
    }

    @JsonProperty("mday")
    public void setMday(String mday) {
        this.mday = mday;
    }

    @JsonProperty("hour")
    public String getHour() {
        return hour;
    }

    @JsonProperty("hour")
    public void setHour(String hour) {
        this.hour = hour;
    }

    @JsonProperty("min")
    public String getMin() {
        return min;
    }

    @JsonProperty("min")
    public void setMin(String min) {
        this.min = min;
    }

    @JsonProperty("tzname")
    public String getTzname() {
        return tzname;
    }

    @JsonProperty("tzname")
    public void setTzname(String tzname) {
        this.tzname = tzname;
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
