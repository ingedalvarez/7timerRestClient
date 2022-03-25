package org.ingedalvarez.timerRestClient.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collections;

import org.ingedalvarez.timerRestClient.model.CivilLight;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CivilLightRestClient {
	
	@Value("${7timer.url}")
	String sevenTimerUrl;
	
	RestTemplate restTemplate;
	
		public CivilLightRestClient(RestTemplateBuilder restTempBuilder) {
		restTemplate = restTempBuilder.build();
	}


	public CivilLight getCivilLight() {
		CivilLight civilLight = null;
		
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Arrays.asList(MediaType.TEXT_PLAIN));
		restTemplate.getMessageConverters().add(converter);
		
		try {
			URI uri;
			uri = new URI(sevenTimerUrl);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			
			HttpEntity<String> request = new HttpEntity<String>(headers);
			
			ResponseEntity<CivilLight> civilLightEntity = restTemplate.exchange(uri, HttpMethod.GET, request, CivilLight.class);
//			CivilLight civilLightEntity = restTemplate.getForObject(uri, CivilLight.class);
			civilLight = civilLightEntity.getBody();		
			
		}catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		return civilLight;
	}

}