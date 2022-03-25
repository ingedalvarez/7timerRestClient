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
"date",
"weather",
"temp2m",
"wind10m_max"
})
@Generated("jsonschema2pojo")

public class Dataserie {
	@JsonProperty("date")
	private Long date;
	@JsonProperty("weather")
	private String weather;
	@JsonProperty("temp2m")
	private Temp2m temp2m;
	@JsonProperty("wind10m_max")
	private Long wind10mMax;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("date")
	public Long getDate() {
	return date;
	}

	@JsonProperty("date")
	public void setDate(Long date) {
	this.date = date;
	}

	@JsonProperty("weather")
	public String getWeather() {
	return weather;
	}

	@JsonProperty("weather")
	public void setWeather(String weather) {
	this.weather = weather;
	}

	@JsonProperty("temp2m")
	public Temp2m getTemp2m() {
	return temp2m;
	}

	@JsonProperty("temp2m")
	public void setTemp2m(Temp2m temp2m) {
	this.temp2m = temp2m;
	}

	@JsonProperty("wind10m_max")
	public Long getWind10mMax() {
	return wind10mMax;
	}

	@JsonProperty("wind10m_max")
	public void setWind10mMax(Long wind10mMax) {
	this.wind10mMax = wind10mMax;
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
		return "Dataserie [date=" + date + ", weather=" + weather + ", temp2m=" + temp2m + ", wind10mMax=" + wind10mMax
				+ "]";
	}



}
