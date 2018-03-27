
package com.example.demo.model.wundergroundDtos.historicalDtos;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "fog",
    "rain",
    "snow",
    "snowfallm",
    "snowfalli",
    "monthtodatesnowfallm",
    "monthtodatesnowfalli",
    "since1julsnowfallm",
    "since1julsnowfalli",
    "snowdepthm",
    "snowdepthi",
    "hail",
    "thunder",
    "tornado",
    "meantempm",
    "meantempi",
    "meandewptm",
    "meandewpti",
    "meanpressurem",
    "meanpressurei",
    "meanwindspdm",
    "meanwindspdi",
    "meanwdire",
    "meanwdird",
    "meanvism",
    "meanvisi",
    "humidity",
    "maxtempm",
    "maxtempi",
    "mintempm",
    "mintempi",
    "maxhumidity",
    "minhumidity",
    "maxdewptm",
    "maxdewpti",
    "mindewptm",
    "mindewpti",
    "maxpressurem",
    "maxpressurei",
    "minpressurem",
    "minpressurei",
    "maxwspdm",
    "maxwspdi",
    "minwspdm",
    "minwspdi",
    "maxvism",
    "maxvisi",
    "minvism",
    "minvisi",
    "gdegreedays",
    "heatingdegreedays",
    "coolingdegreedays",
    "precipm",
    "precipi",
    "precipsource",
    "heatingdegreedaysnormal",
    "monthtodateheatingdegreedays",
    "monthtodateheatingdegreedaysnormal",
    "since1sepheatingdegreedays",
    "since1sepheatingdegreedaysnormal",
    "since1julheatingdegreedays",
    "since1julheatingdegreedaysnormal",
    "coolingdegreedaysnormal",
    "monthtodatecoolingdegreedays",
    "monthtodatecoolingdegreedaysnormal",
    "since1sepcoolingdegreedays",
    "since1sepcoolingdegreedaysnormal",
    "since1jancoolingdegreedays",
    "since1jancoolingdegreedaysnormal"
})
public class Dailysummary {

    @JsonProperty("date")
    private Date__ date;
    @JsonProperty("fog")
    private String fog;
    @JsonProperty("rain")
    private String rain;
    @JsonProperty("snow")
    private String snow;
    @JsonProperty("snowfallm")
    private String snowfallm;
    @JsonProperty("snowfalli")
    private String snowfalli;
    @JsonProperty("monthtodatesnowfallm")
    private String monthtodatesnowfallm;
    @JsonProperty("monthtodatesnowfalli")
    private String monthtodatesnowfalli;
    @JsonProperty("since1julsnowfallm")
    private String since1julsnowfallm;
    @JsonProperty("since1julsnowfalli")
    private String since1julsnowfalli;
    @JsonProperty("snowdepthm")
    private String snowdepthm;
    @JsonProperty("snowdepthi")
    private String snowdepthi;
    @JsonProperty("hail")
    private String hail;
    @JsonProperty("thunder")
    private String thunder;
    @JsonProperty("tornado")
    private String tornado;
    @JsonProperty("meantempm")
    private String meantempm;
    @JsonProperty("meantempi")
    private String meantempi;
    @JsonProperty("meandewptm")
    private String meandewptm;
    @JsonProperty("meandewpti")
    private String meandewpti;
    @JsonProperty("meanpressurem")
    private String meanpressurem;
    @JsonProperty("meanpressurei")
    private String meanpressurei;
    @JsonProperty("meanwindspdm")
    private String meanwindspdm;
    @JsonProperty("meanwindspdi")
    private String meanwindspdi;
    @JsonProperty("meanwdire")
    private String meanwdire;
    @JsonProperty("meanwdird")
    private String meanwdird;
    @JsonProperty("meanvism")
    private String meanvism;
    @JsonProperty("meanvisi")
    private String meanvisi;
    @JsonProperty("humidity")
    private String humidity;
    @JsonProperty("maxtempm")
    private String maxtempm;
    @JsonProperty("maxtempi")
    private String maxtempi;
    @JsonProperty("mintempm")
    private String mintempm;
    @JsonProperty("mintempi")
    private String mintempi;
    @JsonProperty("maxhumidity")
    private String maxhumidity;
    @JsonProperty("minhumidity")
    private String minhumidity;
    @JsonProperty("maxdewptm")
    private String maxdewptm;
    @JsonProperty("maxdewpti")
    private String maxdewpti;
    @JsonProperty("mindewptm")
    private String mindewptm;
    @JsonProperty("mindewpti")
    private String mindewpti;
    @JsonProperty("maxpressurem")
    private String maxpressurem;
    @JsonProperty("maxpressurei")
    private String maxpressurei;
    @JsonProperty("minpressurem")
    private String minpressurem;
    @JsonProperty("minpressurei")
    private String minpressurei;
    @JsonProperty("maxwspdm")
    private String maxwspdm;
    @JsonProperty("maxwspdi")
    private String maxwspdi;
    @JsonProperty("minwspdm")
    private String minwspdm;
    @JsonProperty("minwspdi")
    private String minwspdi;
    @JsonProperty("maxvism")
    private String maxvism;
    @JsonProperty("maxvisi")
    private String maxvisi;
    @JsonProperty("minvism")
    private String minvism;
    @JsonProperty("minvisi")
    private String minvisi;
    @JsonProperty("gdegreedays")
    private String gdegreedays;
    @JsonProperty("heatingdegreedays")
    private String heatingdegreedays;
    @JsonProperty("coolingdegreedays")
    private String coolingdegreedays;
    @JsonProperty("precipm")
    private String precipm;
    @JsonProperty("precipi")
    private String precipi;
    @JsonProperty("precipsource")
    private String precipsource;
    @JsonProperty("heatingdegreedaysnormal")
    private String heatingdegreedaysnormal;
    @JsonProperty("monthtodateheatingdegreedays")
    private String monthtodateheatingdegreedays;
    @JsonProperty("monthtodateheatingdegreedaysnormal")
    private String monthtodateheatingdegreedaysnormal;
    @JsonProperty("since1sepheatingdegreedays")
    private String since1sepheatingdegreedays;
    @JsonProperty("since1sepheatingdegreedaysnormal")
    private String since1sepheatingdegreedaysnormal;
    @JsonProperty("since1julheatingdegreedays")
    private String since1julheatingdegreedays;
    @JsonProperty("since1julheatingdegreedaysnormal")
    private String since1julheatingdegreedaysnormal;
    @JsonProperty("coolingdegreedaysnormal")
    private String coolingdegreedaysnormal;
    @JsonProperty("monthtodatecoolingdegreedays")
    private String monthtodatecoolingdegreedays;
    @JsonProperty("monthtodatecoolingdegreedaysnormal")
    private String monthtodatecoolingdegreedaysnormal;
    @JsonProperty("since1sepcoolingdegreedays")
    private String since1sepcoolingdegreedays;
    @JsonProperty("since1sepcoolingdegreedaysnormal")
    private String since1sepcoolingdegreedaysnormal;
    @JsonProperty("since1jancoolingdegreedays")
    private String since1jancoolingdegreedays;
    @JsonProperty("since1jancoolingdegreedaysnormal")
    private String since1jancoolingdegreedaysnormal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public Date__ getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date__ date) {
        this.date = date;
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

    @JsonProperty("snowfallm")
    public String getSnowfallm() {
        return snowfallm;
    }

    @JsonProperty("snowfallm")
    public void setSnowfallm(String snowfallm) {
        this.snowfallm = snowfallm;
    }

    @JsonProperty("snowfalli")
    public String getSnowfalli() {
        return snowfalli;
    }

    @JsonProperty("snowfalli")
    public void setSnowfalli(String snowfalli) {
        this.snowfalli = snowfalli;
    }

    @JsonProperty("monthtodatesnowfallm")
    public String getMonthtodatesnowfallm() {
        return monthtodatesnowfallm;
    }

    @JsonProperty("monthtodatesnowfallm")
    public void setMonthtodatesnowfallm(String monthtodatesnowfallm) {
        this.monthtodatesnowfallm = monthtodatesnowfallm;
    }

    @JsonProperty("monthtodatesnowfalli")
    public String getMonthtodatesnowfalli() {
        return monthtodatesnowfalli;
    }

    @JsonProperty("monthtodatesnowfalli")
    public void setMonthtodatesnowfalli(String monthtodatesnowfalli) {
        this.monthtodatesnowfalli = monthtodatesnowfalli;
    }

    @JsonProperty("since1julsnowfallm")
    public String getSince1julsnowfallm() {
        return since1julsnowfallm;
    }

    @JsonProperty("since1julsnowfallm")
    public void setSince1julsnowfallm(String since1julsnowfallm) {
        this.since1julsnowfallm = since1julsnowfallm;
    }

    @JsonProperty("since1julsnowfalli")
    public String getSince1julsnowfalli() {
        return since1julsnowfalli;
    }

    @JsonProperty("since1julsnowfalli")
    public void setSince1julsnowfalli(String since1julsnowfalli) {
        this.since1julsnowfalli = since1julsnowfalli;
    }

    @JsonProperty("snowdepthm")
    public String getSnowdepthm() {
        return snowdepthm;
    }

    @JsonProperty("snowdepthm")
    public void setSnowdepthm(String snowdepthm) {
        this.snowdepthm = snowdepthm;
    }

    @JsonProperty("snowdepthi")
    public String getSnowdepthi() {
        return snowdepthi;
    }

    @JsonProperty("snowdepthi")
    public void setSnowdepthi(String snowdepthi) {
        this.snowdepthi = snowdepthi;
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

    @JsonProperty("meantempm")
    public String getMeantempm() {
        return meantempm;
    }

    @JsonProperty("meantempm")
    public void setMeantempm(String meantempm) {
        this.meantempm = meantempm;
    }

    @JsonProperty("meantempi")
    public String getMeantempi() {
        return meantempi;
    }

    @JsonProperty("meantempi")
    public void setMeantempi(String meantempi) {
        this.meantempi = meantempi;
    }

    @JsonProperty("meandewptm")
    public String getMeandewptm() {
        return meandewptm;
    }

    @JsonProperty("meandewptm")
    public void setMeandewptm(String meandewptm) {
        this.meandewptm = meandewptm;
    }

    @JsonProperty("meandewpti")
    public String getMeandewpti() {
        return meandewpti;
    }

    @JsonProperty("meandewpti")
    public void setMeandewpti(String meandewpti) {
        this.meandewpti = meandewpti;
    }

    @JsonProperty("meanpressurem")
    public String getMeanpressurem() {
        return meanpressurem;
    }

    @JsonProperty("meanpressurem")
    public void setMeanpressurem(String meanpressurem) {
        this.meanpressurem = meanpressurem;
    }

    @JsonProperty("meanpressurei")
    public String getMeanpressurei() {
        return meanpressurei;
    }

    @JsonProperty("meanpressurei")
    public void setMeanpressurei(String meanpressurei) {
        this.meanpressurei = meanpressurei;
    }

    @JsonProperty("meanwindspdm")
    public String getMeanwindspdm() {
        return meanwindspdm;
    }

    @JsonProperty("meanwindspdm")
    public void setMeanwindspdm(String meanwindspdm) {
        this.meanwindspdm = meanwindspdm;
    }

    @JsonProperty("meanwindspdi")
    public String getMeanwindspdi() {
        return meanwindspdi;
    }

    @JsonProperty("meanwindspdi")
    public void setMeanwindspdi(String meanwindspdi) {
        this.meanwindspdi = meanwindspdi;
    }

    @JsonProperty("meanwdire")
    public String getMeanwdire() {
        return meanwdire;
    }

    @JsonProperty("meanwdire")
    public void setMeanwdire(String meanwdire) {
        this.meanwdire = meanwdire;
    }

    @JsonProperty("meanwdird")
    public String getMeanwdird() {
        return meanwdird;
    }

    @JsonProperty("meanwdird")
    public void setMeanwdird(String meanwdird) {
        this.meanwdird = meanwdird;
    }

    @JsonProperty("meanvism")
    public String getMeanvism() {
        return meanvism;
    }

    @JsonProperty("meanvism")
    public void setMeanvism(String meanvism) {
        this.meanvism = meanvism;
    }

    @JsonProperty("meanvisi")
    public String getMeanvisi() {
        return meanvisi;
    }

    @JsonProperty("meanvisi")
    public void setMeanvisi(String meanvisi) {
        this.meanvisi = meanvisi;
    }

    @JsonProperty("humidity")
    public String getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("maxtempm")
    public String getMaxtempm() {
        return maxtempm;
    }

    @JsonProperty("maxtempm")
    public void setMaxtempm(String maxtempm) {
        this.maxtempm = maxtempm;
    }

    @JsonProperty("maxtempi")
    public String getMaxtempi() {
        return maxtempi;
    }

    @JsonProperty("maxtempi")
    public void setMaxtempi(String maxtempi) {
        this.maxtempi = maxtempi;
    }

    @JsonProperty("mintempm")
    public String getMintempm() {
        return mintempm;
    }

    @JsonProperty("mintempm")
    public void setMintempm(String mintempm) {
        this.mintempm = mintempm;
    }

    @JsonProperty("mintempi")
    public String getMintempi() {
        return mintempi;
    }

    @JsonProperty("mintempi")
    public void setMintempi(String mintempi) {
        this.mintempi = mintempi;
    }

    @JsonProperty("maxhumidity")
    public String getMaxhumidity() {
        return maxhumidity;
    }

    @JsonProperty("maxhumidity")
    public void setMaxhumidity(String maxhumidity) {
        this.maxhumidity = maxhumidity;
    }

    @JsonProperty("minhumidity")
    public String getMinhumidity() {
        return minhumidity;
    }

    @JsonProperty("minhumidity")
    public void setMinhumidity(String minhumidity) {
        this.minhumidity = minhumidity;
    }

    @JsonProperty("maxdewptm")
    public String getMaxdewptm() {
        return maxdewptm;
    }

    @JsonProperty("maxdewptm")
    public void setMaxdewptm(String maxdewptm) {
        this.maxdewptm = maxdewptm;
    }

    @JsonProperty("maxdewpti")
    public String getMaxdewpti() {
        return maxdewpti;
    }

    @JsonProperty("maxdewpti")
    public void setMaxdewpti(String maxdewpti) {
        this.maxdewpti = maxdewpti;
    }

    @JsonProperty("mindewptm")
    public String getMindewptm() {
        return mindewptm;
    }

    @JsonProperty("mindewptm")
    public void setMindewptm(String mindewptm) {
        this.mindewptm = mindewptm;
    }

    @JsonProperty("mindewpti")
    public String getMindewpti() {
        return mindewpti;
    }

    @JsonProperty("mindewpti")
    public void setMindewpti(String mindewpti) {
        this.mindewpti = mindewpti;
    }

    @JsonProperty("maxpressurem")
    public String getMaxpressurem() {
        return maxpressurem;
    }

    @JsonProperty("maxpressurem")
    public void setMaxpressurem(String maxpressurem) {
        this.maxpressurem = maxpressurem;
    }

    @JsonProperty("maxpressurei")
    public String getMaxpressurei() {
        return maxpressurei;
    }

    @JsonProperty("maxpressurei")
    public void setMaxpressurei(String maxpressurei) {
        this.maxpressurei = maxpressurei;
    }

    @JsonProperty("minpressurem")
    public String getMinpressurem() {
        return minpressurem;
    }

    @JsonProperty("minpressurem")
    public void setMinpressurem(String minpressurem) {
        this.minpressurem = minpressurem;
    }

    @JsonProperty("minpressurei")
    public String getMinpressurei() {
        return minpressurei;
    }

    @JsonProperty("minpressurei")
    public void setMinpressurei(String minpressurei) {
        this.minpressurei = minpressurei;
    }

    @JsonProperty("maxwspdm")
    public String getMaxwspdm() {
        return maxwspdm;
    }

    @JsonProperty("maxwspdm")
    public void setMaxwspdm(String maxwspdm) {
        this.maxwspdm = maxwspdm;
    }

    @JsonProperty("maxwspdi")
    public String getMaxwspdi() {
        return maxwspdi;
    }

    @JsonProperty("maxwspdi")
    public void setMaxwspdi(String maxwspdi) {
        this.maxwspdi = maxwspdi;
    }

    @JsonProperty("minwspdm")
    public String getMinwspdm() {
        return minwspdm;
    }

    @JsonProperty("minwspdm")
    public void setMinwspdm(String minwspdm) {
        this.minwspdm = minwspdm;
    }

    @JsonProperty("minwspdi")
    public String getMinwspdi() {
        return minwspdi;
    }

    @JsonProperty("minwspdi")
    public void setMinwspdi(String minwspdi) {
        this.minwspdi = minwspdi;
    }

    @JsonProperty("maxvism")
    public String getMaxvism() {
        return maxvism;
    }

    @JsonProperty("maxvism")
    public void setMaxvism(String maxvism) {
        this.maxvism = maxvism;
    }

    @JsonProperty("maxvisi")
    public String getMaxvisi() {
        return maxvisi;
    }

    @JsonProperty("maxvisi")
    public void setMaxvisi(String maxvisi) {
        this.maxvisi = maxvisi;
    }

    @JsonProperty("minvism")
    public String getMinvism() {
        return minvism;
    }

    @JsonProperty("minvism")
    public void setMinvism(String minvism) {
        this.minvism = minvism;
    }

    @JsonProperty("minvisi")
    public String getMinvisi() {
        return minvisi;
    }

    @JsonProperty("minvisi")
    public void setMinvisi(String minvisi) {
        this.minvisi = minvisi;
    }

    @JsonProperty("gdegreedays")
    public String getGdegreedays() {
        return gdegreedays;
    }

    @JsonProperty("gdegreedays")
    public void setGdegreedays(String gdegreedays) {
        this.gdegreedays = gdegreedays;
    }

    @JsonProperty("heatingdegreedays")
    public String getHeatingdegreedays() {
        return heatingdegreedays;
    }

    @JsonProperty("heatingdegreedays")
    public void setHeatingdegreedays(String heatingdegreedays) {
        this.heatingdegreedays = heatingdegreedays;
    }

    @JsonProperty("coolingdegreedays")
    public String getCoolingdegreedays() {
        return coolingdegreedays;
    }

    @JsonProperty("coolingdegreedays")
    public void setCoolingdegreedays(String coolingdegreedays) {
        this.coolingdegreedays = coolingdegreedays;
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

    @JsonProperty("precipsource")
    public String getPrecipsource() {
        return precipsource;
    }

    @JsonProperty("precipsource")
    public void setPrecipsource(String precipsource) {
        this.precipsource = precipsource;
    }

    @JsonProperty("heatingdegreedaysnormal")
    public String getHeatingdegreedaysnormal() {
        return heatingdegreedaysnormal;
    }

    @JsonProperty("heatingdegreedaysnormal")
    public void setHeatingdegreedaysnormal(String heatingdegreedaysnormal) {
        this.heatingdegreedaysnormal = heatingdegreedaysnormal;
    }

    @JsonProperty("monthtodateheatingdegreedays")
    public String getMonthtodateheatingdegreedays() {
        return monthtodateheatingdegreedays;
    }

    @JsonProperty("monthtodateheatingdegreedays")
    public void setMonthtodateheatingdegreedays(String monthtodateheatingdegreedays) {
        this.monthtodateheatingdegreedays = monthtodateheatingdegreedays;
    }

    @JsonProperty("monthtodateheatingdegreedaysnormal")
    public String getMonthtodateheatingdegreedaysnormal() {
        return monthtodateheatingdegreedaysnormal;
    }

    @JsonProperty("monthtodateheatingdegreedaysnormal")
    public void setMonthtodateheatingdegreedaysnormal(String monthtodateheatingdegreedaysnormal) {
        this.monthtodateheatingdegreedaysnormal = monthtodateheatingdegreedaysnormal;
    }

    @JsonProperty("since1sepheatingdegreedays")
    public String getSince1sepheatingdegreedays() {
        return since1sepheatingdegreedays;
    }

    @JsonProperty("since1sepheatingdegreedays")
    public void setSince1sepheatingdegreedays(String since1sepheatingdegreedays) {
        this.since1sepheatingdegreedays = since1sepheatingdegreedays;
    }

    @JsonProperty("since1sepheatingdegreedaysnormal")
    public String getSince1sepheatingdegreedaysnormal() {
        return since1sepheatingdegreedaysnormal;
    }

    @JsonProperty("since1sepheatingdegreedaysnormal")
    public void setSince1sepheatingdegreedaysnormal(String since1sepheatingdegreedaysnormal) {
        this.since1sepheatingdegreedaysnormal = since1sepheatingdegreedaysnormal;
    }

    @JsonProperty("since1julheatingdegreedays")
    public String getSince1julheatingdegreedays() {
        return since1julheatingdegreedays;
    }

    @JsonProperty("since1julheatingdegreedays")
    public void setSince1julheatingdegreedays(String since1julheatingdegreedays) {
        this.since1julheatingdegreedays = since1julheatingdegreedays;
    }

    @JsonProperty("since1julheatingdegreedaysnormal")
    public String getSince1julheatingdegreedaysnormal() {
        return since1julheatingdegreedaysnormal;
    }

    @JsonProperty("since1julheatingdegreedaysnormal")
    public void setSince1julheatingdegreedaysnormal(String since1julheatingdegreedaysnormal) {
        this.since1julheatingdegreedaysnormal = since1julheatingdegreedaysnormal;
    }

    @JsonProperty("coolingdegreedaysnormal")
    public String getCoolingdegreedaysnormal() {
        return coolingdegreedaysnormal;
    }

    @JsonProperty("coolingdegreedaysnormal")
    public void setCoolingdegreedaysnormal(String coolingdegreedaysnormal) {
        this.coolingdegreedaysnormal = coolingdegreedaysnormal;
    }

    @JsonProperty("monthtodatecoolingdegreedays")
    public String getMonthtodatecoolingdegreedays() {
        return monthtodatecoolingdegreedays;
    }

    @JsonProperty("monthtodatecoolingdegreedays")
    public void setMonthtodatecoolingdegreedays(String monthtodatecoolingdegreedays) {
        this.monthtodatecoolingdegreedays = monthtodatecoolingdegreedays;
    }

    @JsonProperty("monthtodatecoolingdegreedaysnormal")
    public String getMonthtodatecoolingdegreedaysnormal() {
        return monthtodatecoolingdegreedaysnormal;
    }

    @JsonProperty("monthtodatecoolingdegreedaysnormal")
    public void setMonthtodatecoolingdegreedaysnormal(String monthtodatecoolingdegreedaysnormal) {
        this.monthtodatecoolingdegreedaysnormal = monthtodatecoolingdegreedaysnormal;
    }

    @JsonProperty("since1sepcoolingdegreedays")
    public String getSince1sepcoolingdegreedays() {
        return since1sepcoolingdegreedays;
    }

    @JsonProperty("since1sepcoolingdegreedays")
    public void setSince1sepcoolingdegreedays(String since1sepcoolingdegreedays) {
        this.since1sepcoolingdegreedays = since1sepcoolingdegreedays;
    }

    @JsonProperty("since1sepcoolingdegreedaysnormal")
    public String getSince1sepcoolingdegreedaysnormal() {
        return since1sepcoolingdegreedaysnormal;
    }

    @JsonProperty("since1sepcoolingdegreedaysnormal")
    public void setSince1sepcoolingdegreedaysnormal(String since1sepcoolingdegreedaysnormal) {
        this.since1sepcoolingdegreedaysnormal = since1sepcoolingdegreedaysnormal;
    }

    @JsonProperty("since1jancoolingdegreedays")
    public String getSince1jancoolingdegreedays() {
        return since1jancoolingdegreedays;
    }

    @JsonProperty("since1jancoolingdegreedays")
    public void setSince1jancoolingdegreedays(String since1jancoolingdegreedays) {
        this.since1jancoolingdegreedays = since1jancoolingdegreedays;
    }

    @JsonProperty("since1jancoolingdegreedaysnormal")
    public String getSince1jancoolingdegreedaysnormal() {
        return since1jancoolingdegreedaysnormal;
    }

    @JsonProperty("since1jancoolingdegreedaysnormal")
    public void setSince1jancoolingdegreedaysnormal(String since1jancoolingdegreedaysnormal) {
        this.since1jancoolingdegreedaysnormal = since1jancoolingdegreedaysnormal;
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
