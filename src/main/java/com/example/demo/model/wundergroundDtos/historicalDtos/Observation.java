
package com.example.demo.model.wundergroundDtos.historicalDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "utcdate",
    "tempm",
    "tempi",
    "dewptm",
    "dewpti",
    "hum",
    "wspdm",
    "wspdi",
    "wgustm",
    "wgusti",
    "wdird",
    "wdire",
    "vism",
    "visi",
    "pressurem",
    "pressurei",
    "windchillm",
    "windchilli",
    "heatindexm",
    "heatindexi",
    "precipm",
    "precipi",
    "conds",
    "icon",
    "fog",
    "rain",
    "snow",
    "hail",
    "thunder",
    "tornado",
    "metar"
})
public class Observation {

    @JsonProperty("date")
    private Date_ date;
    @JsonProperty("utcdate")
    private Utcdate_ utcdate;
    @JsonProperty("tempm")
    private String tempm;
    @JsonProperty("tempi")
    private String tempi;
    @JsonProperty("dewptm")
    private String dewptm;
    @JsonProperty("dewpti")
    private String dewpti;
    @JsonProperty("hum")
    private String hum;
    @JsonProperty("wspdm")
    private String wspdm;
    @JsonProperty("wspdi")
    private String wspdi;
    @JsonProperty("wgustm")
    private String wgustm;
    @JsonProperty("wgusti")
    private String wgusti;
    @JsonProperty("wdird")
    private String wdird;
    @JsonProperty("wdire")
    private String wdire;
    @JsonProperty("vism")
    private String vism;
    @JsonProperty("visi")
    private String visi;
    @JsonProperty("pressurem")
    private String pressurem;
    @JsonProperty("pressurei")
    private String pressurei;
    @JsonProperty("windchillm")
    private String windchillm;
    @JsonProperty("windchilli")
    private String windchilli;
    @JsonProperty("heatindexm")
    private String heatindexm;
    @JsonProperty("heatindexi")
    private String heatindexi;
    @JsonProperty("precipm")
    private String precipm;
    @JsonProperty("precipi")
    private String precipi;
    @JsonProperty("conds")
    private String conds;
    @JsonProperty("icon")
    private String icon;
    @JsonProperty("fog")
    private String fog;
    @JsonProperty("rain")
    private String rain;
    @JsonProperty("snow")
    private String snow;
    @JsonProperty("hail")
    private String hail;
    @JsonProperty("thunder")
    private String thunder;
    @JsonProperty("tornado")
    private String tornado;
    @JsonProperty("metar")
    private String metar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public Date_ getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date_ date) {
        this.date = date;
    }

    @JsonProperty("utcdate")
    public Utcdate_ getUtcdate() {
        return utcdate;
    }

    @JsonProperty("utcdate")
    public void setUtcdate(Utcdate_ utcdate) {
        this.utcdate = utcdate;
    }

    @JsonProperty("tempm")
    public String getTempm() {
        return tempm;
    }

    @JsonProperty("tempm")
    public void setTempm(String tempm) {
        this.tempm = tempm;
    }

    @JsonProperty("tempi")
    public String getTempi() {
        return tempi;
    }

    @JsonProperty("tempi")
    public void setTempi(String tempi) {
        this.tempi = tempi;
    }

    @JsonProperty("dewptm")
    public String getDewptm() {
        return dewptm;
    }

    @JsonProperty("dewptm")
    public void setDewptm(String dewptm) {
        this.dewptm = dewptm;
    }

    @JsonProperty("dewpti")
    public String getDewpti() {
        return dewpti;
    }

    @JsonProperty("dewpti")
    public void setDewpti(String dewpti) {
        this.dewpti = dewpti;
    }

    @JsonProperty("hum")
    public String getHum() {
        return hum;
    }

    @JsonProperty("hum")
    public void setHum(String hum) {
        this.hum = hum;
    }

    @JsonProperty("wspdm")
    public String getWspdm() {
        return wspdm;
    }

    @JsonProperty("wspdm")
    public void setWspdm(String wspdm) {
        this.wspdm = wspdm;
    }

    @JsonProperty("wspdi")
    public String getWspdi() {
        return wspdi;
    }

    @JsonProperty("wspdi")
    public void setWspdi(String wspdi) {
        this.wspdi = wspdi;
    }

    @JsonProperty("wgustm")
    public String getWgustm() {
        return wgustm;
    }

    @JsonProperty("wgustm")
    public void setWgustm(String wgustm) {
        this.wgustm = wgustm;
    }

    @JsonProperty("wgusti")
    public String getWgusti() {
        return wgusti;
    }

    @JsonProperty("wgusti")
    public void setWgusti(String wgusti) {
        this.wgusti = wgusti;
    }

    @JsonProperty("wdird")
    public String getWdird() {
        return wdird;
    }

    @JsonProperty("wdird")
    public void setWdird(String wdird) {
        this.wdird = wdird;
    }

    @JsonProperty("wdire")
    public String getWdire() {
        return wdire;
    }

    @JsonProperty("wdire")
    public void setWdire(String wdire) {
        this.wdire = wdire;
    }

    @JsonProperty("vism")
    public String getVism() {
        return vism;
    }

    @JsonProperty("vism")
    public void setVism(String vism) {
        this.vism = vism;
    }

    @JsonProperty("visi")
    public String getVisi() {
        return visi;
    }

    @JsonProperty("visi")
    public void setVisi(String visi) {
        this.visi = visi;
    }

    @JsonProperty("pressurem")
    public String getPressurem() {
        return pressurem;
    }

    @JsonProperty("pressurem")
    public void setPressurem(String pressurem) {
        this.pressurem = pressurem;
    }

    @JsonProperty("pressurei")
    public String getPressurei() {
        return pressurei;
    }

    @JsonProperty("pressurei")
    public void setPressurei(String pressurei) {
        this.pressurei = pressurei;
    }

    @JsonProperty("windchillm")
    public String getWindchillm() {
        return windchillm;
    }

    @JsonProperty("windchillm")
    public void setWindchillm(String windchillm) {
        this.windchillm = windchillm;
    }

    @JsonProperty("windchilli")
    public String getWindchilli() {
        return windchilli;
    }

    @JsonProperty("windchilli")
    public void setWindchilli(String windchilli) {
        this.windchilli = windchilli;
    }

    @JsonProperty("heatindexm")
    public String getHeatindexm() {
        return heatindexm;
    }

    @JsonProperty("heatindexm")
    public void setHeatindexm(String heatindexm) {
        this.heatindexm = heatindexm;
    }

    @JsonProperty("heatindexi")
    public String getHeatindexi() {
        return heatindexi;
    }

    @JsonProperty("heatindexi")
    public void setHeatindexi(String heatindexi) {
        this.heatindexi = heatindexi;
    }

    @JsonProperty("precipm")
    public String getPrecipm() {
        return precipm;
    }

    @JsonProperty("precipm")
    public void setPrecipm(String precipm) {
        this.precipm = precipm;
    }

    @JsonProperty("precipi")
    public String getPrecipi() {
        return precipi;
    }

    @JsonProperty("precipi")
    public void setPrecipi(String precipi) {
        this.precipi = precipi;
    }

    @JsonProperty("conds")
    public String getConds() {
        return conds;
    }

    @JsonProperty("conds")
    public void setConds(String conds) {
        this.conds = conds;
    }

    @JsonProperty("icon")
    public String getIcon() {
        return icon;
    }

    @JsonProperty("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonProperty("fog")
    public String getFog() {
        return fog;
    }

    @JsonProperty("fog")
    public void setFog(String fog) {
        this.fog = fog;
    }

    @JsonProperty("rain")
    public String getRain() {
        return rain;
    }

    @JsonProperty("rain")
    public void setRain(String rain) {
        this.rain = rain;
    }

    @JsonProperty("snow")
    public String getSnow() {
        return snow;
    }

    @JsonProperty("snow")
    public void setSnow(String snow) {
        this.snow = snow;
    }

    @JsonProperty("hail")
    public String getHail() {
        return hail;
    }

    @JsonProperty("hail")
    public void setHail(String hail) {
        this.hail = hail;
    }

    @JsonProperty("thunder")
    public String getThunder() {
        return thunder;
    }

    @JsonProperty("thunder")
    public void setThunder(String thunder) {
        this.thunder = thunder;
    }

    @JsonProperty("tornado")
    public String getTornado() {
        return tornado;
    }

    @JsonProperty("tornado")
    public void setTornado(String tornado) {
        this.tornado = tornado;
    }

    @JsonProperty("metar")
    public String getMetar() {
        return metar;
    }

    @JsonProperty("metar")
    public void setMetar(String metar) {
        this.metar = metar;
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
