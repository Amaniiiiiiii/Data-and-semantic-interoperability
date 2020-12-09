
package com.temp.test;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temperature",
    "feelLikesTemperature",
    "relativeHumidity",
    "weatherType",
    "visibility",
    "windDirection",
    "windSpeed",
    "refPointOfInterest"
})
public class WeatherCommons {

    @JsonProperty("temperature")
    private Double temperature;
    @JsonProperty("feelLikesTemperature")
    private Double feelLikesTemperature;
    @JsonProperty("relativeHumidity")
    private Double relativeHumidity;
    @JsonProperty("weatherType")
    private String weatherType;
    @JsonProperty("visibility")
    private WeatherCommons.Visibility visibility;
    @JsonProperty("windDirection")
    private Integer windDirection;
    @JsonProperty("windSpeed")
    private Double windSpeed;
    @JsonProperty("refPointOfInterest")
    private String refPointOfInterest;
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

    public WeatherCommons withTemperature(Double temperature) {
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

    public WeatherCommons withFeelLikesTemperature(Double feelLikesTemperature) {
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

    public WeatherCommons withRelativeHumidity(Double relativeHumidity) {
        this.relativeHumidity = relativeHumidity;
        return this;
    }

    @JsonProperty("weatherType")
    public String getWeatherType() {
        return weatherType;
    }

    @JsonProperty("weatherType")
    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public WeatherCommons withWeatherType(String weatherType) {
        this.weatherType = weatherType;
        return this;
    }

    @JsonProperty("visibility")
    public WeatherCommons.Visibility getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(WeatherCommons.Visibility visibility) {
        this.visibility = visibility;
    }

    public WeatherCommons withVisibility(WeatherCommons.Visibility visibility) {
        this.visibility = visibility;
        return this;
    }

    @JsonProperty("windDirection")
    public Integer getWindDirection() {
        return windDirection;
    }

    @JsonProperty("windDirection")
    public void setWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
    }

    public WeatherCommons withWindDirection(Integer windDirection) {
        this.windDirection = windDirection;
        return this;
    }

    @JsonProperty("windSpeed")
    public Double getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("windSpeed")
    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public WeatherCommons withWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    @JsonProperty("refPointOfInterest")
    public String getRefPointOfInterest() {
        return refPointOfInterest;
    }

    @JsonProperty("refPointOfInterest")
    public void setRefPointOfInterest(String refPointOfInterest) {
        this.refPointOfInterest = refPointOfInterest;
    }

    public WeatherCommons withRefPointOfInterest(String refPointOfInterest) {
        this.refPointOfInterest = refPointOfInterest;
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

    public WeatherCommons withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WeatherCommons.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("weatherType");
        sb.append('=');
        sb.append(((this.weatherType == null)?"<null>":this.weatherType));
        sb.append(',');
        sb.append("visibility");
        sb.append('=');
        sb.append(((this.visibility == null)?"<null>":this.visibility));
        sb.append(',');
        sb.append("windDirection");
        sb.append('=');
        sb.append(((this.windDirection == null)?"<null>":this.windDirection));
        sb.append(',');
        sb.append("windSpeed");
        sb.append('=');
        sb.append(((this.windSpeed == null)?"<null>":this.windSpeed));
        sb.append(',');
        sb.append("refPointOfInterest");
        sb.append('=');
        sb.append(((this.refPointOfInterest == null)?"<null>":this.refPointOfInterest));
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
        result = ((result* 31)+((this.weatherType == null)? 0 :this.weatherType.hashCode()));
        result = ((result* 31)+((this.visibility == null)? 0 :this.visibility.hashCode()));
        result = ((result* 31)+((this.temperature == null)? 0 :this.temperature.hashCode()));
        result = ((result* 31)+((this.relativeHumidity == null)? 0 :this.relativeHumidity.hashCode()));
        result = ((result* 31)+((this.windDirection == null)? 0 :this.windDirection.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.windSpeed == null)? 0 :this.windSpeed.hashCode()));
        result = ((result* 31)+((this.feelLikesTemperature == null)? 0 :this.feelLikesTemperature.hashCode()));
        result = ((result* 31)+((this.refPointOfInterest == null)? 0 :this.refPointOfInterest.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WeatherCommons) == false) {
            return false;
        }
        WeatherCommons rhs = ((WeatherCommons) other);
        return ((((((((((this.weatherType == rhs.weatherType)||((this.weatherType!= null)&&this.weatherType.equals(rhs.weatherType)))&&((this.visibility == rhs.visibility)||((this.visibility!= null)&&this.visibility.equals(rhs.visibility))))&&((this.temperature == rhs.temperature)||((this.temperature!= null)&&this.temperature.equals(rhs.temperature))))&&((this.relativeHumidity == rhs.relativeHumidity)||((this.relativeHumidity!= null)&&this.relativeHumidity.equals(rhs.relativeHumidity))))&&((this.windDirection == rhs.windDirection)||((this.windDirection!= null)&&this.windDirection.equals(rhs.windDirection))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.windSpeed == rhs.windSpeed)||((this.windSpeed!= null)&&this.windSpeed.equals(rhs.windSpeed))))&&((this.feelLikesTemperature == rhs.feelLikesTemperature)||((this.feelLikesTemperature!= null)&&this.feelLikesTemperature.equals(rhs.feelLikesTemperature))))&&((this.refPointOfInterest == rhs.refPointOfInterest)||((this.refPointOfInterest!= null)&&this.refPointOfInterest.equals(rhs.refPointOfInterest))));
    }

    public enum Visibility {

        VERY_POOR("veryPoor"),
        POOR("poor"),
        MODERATE("moderate"),
        GOOD("good"),
        VERY_GOOD("veryGood"),
        EXCELLENT("excellent");
        private final String value;
        private final static Map<String, WeatherCommons.Visibility> CONSTANTS = new HashMap<String, WeatherCommons.Visibility>();

        static {
            for (WeatherCommons.Visibility c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Visibility(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static WeatherCommons.Visibility fromValue(String value) {
            WeatherCommons.Visibility constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
