
package ma.youcode.weather.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "time",
    "temperature_2m"
})
@Generated("jsonschema2pojo")
public class Hourly {

    @JsonProperty("time")
    private List<String> time = null;
    @JsonProperty("temperature_2m")
    private List<Double> temperature2m = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("time")
    public List<String> getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(List<String> time) {
        this.time = time;
    }

    @JsonProperty("temperature_2m")
    public List<Double> getTemperature2m() {
        return temperature2m;
    }

    @JsonProperty("temperature_2m")
    public void setTemperature2m(List<Double> temperature2m) {
        this.temperature2m = temperature2m;
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
