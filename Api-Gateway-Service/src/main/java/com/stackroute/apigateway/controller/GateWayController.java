package com.stackroute.apigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GateWayController {

	
	private RestTemplate restTemplate;
	
	public GateWayController(RestTemplate restTemplate) {
		
		this.restTemplate=restTemplate;
	}
	
	public ResponseEntity getReport() {
		
		ResponseEntity<?> responseEntity = null;
		
		return responseEntity;
	}
}
