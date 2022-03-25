package org.ingedalvarez.timerRestClient;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.ingedalvarez.timerRestClient.controller.CivilLightRestClient;
import org.ingedalvarez.timerRestClient.model.CivilLight;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ApplicationTests {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);
	@Autowired
	CivilLightRestClient civilLigtRest;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	@DisplayName("return notnull objet")
	public void civilLightNotNull() {
		CivilLight civilLight = civilLigtRest.getCivilLight();
		log.info(civilLight.toString());
		assertNotNull(civilLight);	
		
	}
	
	@Test
	@DisplayName("return objet of type Civillight.class")
	public void typeOfCivilLight() {
		CivilLight civilLight = civilLigtRest.getCivilLight();
		assertTrue(civilLight.getClass().toString().contains("CivilLight"));
		log.info(civilLight.getClass().toString());
			
	}
	

}
