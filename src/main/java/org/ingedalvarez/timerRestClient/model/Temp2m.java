package org.ingedalvarez.timerRestClient.model;

import java.util.HashMap;
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
"max",
"min"
})
@Generated("jsonschema2pojo")

public class Temp2m {
	
	@JsonProperty("max")
	private Long max;
	@JsonProperty("min")
	private Long min;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("max")
	public Long getMax() {
	return max;
	}

	@JsonProperty("max")
	public void setMax(Long max) {
	this.max = max;
	}

	@JsonProperty("min")
	public Long getMin() {
	return min;
	}

	@JsonProperty("min")
	public void setMin(Long min) {
	this.min = min;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "Temp2m [max=" + max + ", min=" + min + "]";
	}

}
