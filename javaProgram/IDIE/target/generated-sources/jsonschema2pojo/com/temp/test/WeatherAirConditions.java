
package com.temp.test;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temperature",
    "feelLikesTemperature",
    "relativeHumidity"
})
public class WeatherAirConditions {

    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("feelLikesTemperature")
    private Double feelLikesTemperature;
    @JsonProperty("relativeHumidity")
    private Double relativeHumidity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("temperature")
    public Double getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public WeatherAirConditions withTemperature(Double temperature) {
        this.temperature = temperature;
        return this;
    }

    @JsonProperty("feelLikesTemperature")
    public Double getFeelLikesTemperature() {
        return feelLikesTemperature;
    }

    @JsonProperty("feelLikesTemperature")
    public void setFeelLikesTemperature(Double feelLikesTemperature) {
        this.feelLikesTemperature = feelLikesTemperature;
    }

    public WeatherAirConditions withFeelLikesTemperature(Double feelLikesTemperature) {
        this.feelLikesTemperature = feelLikesTemperature;
        return this;
    }

    @JsonProperty("relativeHumidity")
    public Double getRelativeHumidity() {
        return relativeHumidity;
    }

    @JsonProperty("relativeHumidity")
    public void setRelativeHumidity(Double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
    }

    public WeatherAirConditions withRelativeHumidity(Double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
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

    public WeatherAirConditions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WeatherAirConditions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("temperature");
        sb.append('=');
        sb.append(((this.temperature == null)?"<null>":this.temperature));
        sb.append(',');
        sb.append("feelLikesTemperature");
        sb.append('=');
        sb.append(((this.feelLikesTemperature == null)?"<null>":this.feelLikesTemperature));
        sb.append(',');
        sb.append("relativeHumidity");
        sb.append('=');
        sb.append(((this.relativeHumidity == null)?"<null>":this.relativeHumidity));
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
        result = ((result* 31)+((this.temperature == null)? 0 :this.temperature.hashCode()));
        result = ((result* 31)+((this.relativeHumidity == null)? 0 :this.relativeHumidity.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.feelLikesTemperature == null)? 0 :this.feelLikesTemperature.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeatherAirConditions) == false) {
            return false;
        }
        WeatherAirConditions rhs = ((WeatherAirConditions) other);
        return (((((this.temperature == rhs.temperature)||((this.temperature!= null)&&this.temperature.equals(rhs.temperature)))&&((this.relativeHumidity == rhs.relativeHumidity)||((this.relativeHumidity!= null)&&this.relativeHumidity.equals(rhs.relativeHumidity))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.feelLikesTemperature == rhs.feelLikesTemperature)||((this.feelLikesTemperature!= null)&&this.feelLikesTemperature.equals(rhs.feelLikesTemperature))));
    }

}
