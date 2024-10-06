package com.app.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app2")
public class ApplicationController2 {
	
	@GetMapping(path = "/handlerMethod1/{variable}")
	public ResponseEntity<Map<String, Object>> handlerMethod1(@PathVariable String variable, @RequestParam String param){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> mapData = new LinkedHashMap<>();
			mapData.put("variable", variable);
			mapData.put("param", param);
			
			responseEntity = new ResponseEntity<Map<String, Object>>(mapData, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String, Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod2/{variable}")
	public ResponseEntity<Map<String, Object>> handlerMethod2(@PathVariable String variable){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> mapData = new LinkedHashMap<>();
			mapData.put("variable", variable);
			mapData.put("request", "handlerMethod2");
			mapData.put("methodName", "handlerMethod2");
			mapData.put("className", "ApplicationController2");
			
			responseEntity = new ResponseEntity<Map<String, Object>>(mapData, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String, Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod2/{variable1}/{variable2}")
	public ResponseEntity<Map<String, Object>> handlerMethod3(@PathVariable String variable1, @PathVariable String variable2){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			Map<String, Object> mapData = new LinkedHashMap<>();
			mapData.put("variable1", variable1);
			mapData.put("variable2", variable2);
			mapData.put("request", "handlerMethod2");
			mapData.put("methodName", "handlerMethod3");
			mapData.put("className", "ApplicationController2");
			
			responseEntity = new ResponseEntity<Map<String, Object>>(mapData, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String, Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
}
