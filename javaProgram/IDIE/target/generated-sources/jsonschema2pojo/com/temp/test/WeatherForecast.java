
package com.temp.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GSMA / FIWARE - Weather Forecast schema
 * <p>
 * A harmonised description of a Weather Forecast
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "alert",
    "date",
    "current",
    "dayMaximum",
    "dayMinimum"
})
public class WeatherForecast {

    /**
     * Location
     * 
     */
    @JsonProperty("location")
    @JsonPropertyDescription("Location")
    private String location;
    @JsonProperty("alert")
    private Object alert;
    @JsonProperty("date")
    private Date date;
    @JsonProperty("current")
    private WeatherCommons current;
    @JsonProperty("dayMaximum")
    private WeatherAirConditions dayMaximum;
    @JsonProperty("dayMinimum")
    private WeatherAirConditions dayMinimum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Location
     * 
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     * Location
     * 
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public WeatherForecast withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("alert")
    public Object getAlert() {
        return alert;
    }

    @JsonProperty("alert")
    public void setAlert(Object alert) {
        this.alert = alert;
    }

    public WeatherForecast withAlert(Object alert) {
        this.alert = alert;
        return this;
    }

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public WeatherForecast withDate(Date date) {
        this.date = date;
        return this;
    }

    @JsonProperty("current")
    public WeatherCommons getCurrent() {
        return current;
    }

    @JsonProperty("current")
    public void setCurrent(WeatherCommons current) {
        this.current = current;
    }

    public WeatherForecast withCurrent(WeatherCommons current) {
        this.current = current;
        return this;
    }

    @JsonProperty("dayMaximum")
    public WeatherAirConditions getDayMaximum() {
        return dayMaximum;
    }

    @JsonProperty("dayMaximum")
    public void setDayMaximum(WeatherAirConditions dayMaximum) {
        this.dayMaximum = dayMaximum;
    }

    public WeatherForecast withDayMaximum(WeatherAirConditions dayMaximum) {
        this.dayMaximum = dayMaximum;
        return this;
    }

    @JsonProperty("dayMinimum")
    public WeatherAirConditions getDayMinimum() {
        return dayMinimum;
    }

    @JsonProperty("dayMinimum")
    public void setDayMinimum(WeatherAirConditions dayMinimum) {
        this.dayMinimum = dayMinimum;
    }

    public WeatherForecast withDayMinimum(WeatherAirConditions dayMinimum) {
        this.dayMinimum = dayMinimum;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public WeatherForecast withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WeatherForecast.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null)?"<null>":this.location));
        sb.append(',');
        sb.append("alert");
        sb.append('=');
        sb.append(((this.alert == null)?"<null>":this.alert));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("current");
        sb.append('=');
        sb.append(((this.current == null)?"<null>":this.current));
        sb.append(',');
        sb.append("dayMaximum");
        sb.append('=');
        sb.append(((this.dayMaximum == null)?"<null>":this.dayMaximum));
        sb.append(',');
        sb.append("dayMinimum");
        sb.append('=');
        sb.append(((this.dayMinimum == null)?"<null>":this.dayMinimum));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.current == null)? 0 :this.current.hashCode()));
        result = ((result* 31)+((this.alert == null)? 0 :this.alert.hashCode()));
        result = ((result* 31)+((this.location == null)? 0 :this.location.hashCode()));
        result = ((result* 31)+((this.dayMaximum == null)? 0 :this.dayMaximum.hashCode()));
        result = ((result* 31)+((this.dayMinimum == null)? 0 :this.dayMinimum.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeatherForecast) == false) {
            return false;
        }
        WeatherForecast rhs = ((WeatherForecast) other);
        return ((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.current == rhs.current)||((this.current!= null)&&this.current.equals(rhs.current))))&&((this.alert == rhs.alert)||((this.alert!= null)&&this.alert.equals(rhs.alert))))&&((this.location == rhs.location)||((this.location!= null)&&this.location.equals(rhs.location))))&&((this.dayMaximum == rhs.dayMaximum)||((this.dayMaximum!= null)&&this.dayMaximum.equals(rhs.dayMaximum))))&&((this.dayMinimum == rhs.dayMinimum)||((this.dayMinimum!= null)&&this.dayMinimum.equals(rhs.dayMinimum))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
