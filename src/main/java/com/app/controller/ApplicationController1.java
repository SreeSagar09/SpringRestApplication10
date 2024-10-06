package com.app.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/app1")
public class ApplicationController1 {	
	
	@GetMapping(path = "/handlerMethod1/{variable}")
	public ResponseEntity<String> handlerMethod1(@PathVariable String variable){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(variable, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod2/{variable}/{variable}/{variable}")
	public ResponseEntity<String[]> handlerMethod2(@PathVariable(name = "variable") String variable1, @PathVariable(value = "variable") String variable2, @PathVariable(name = "variable") String variable3){
		ResponseEntity<String[]> responseEntity = null;
		try {
			String[] variables = {variable1, variable2, variable3};
			responseEntity = new ResponseEntity<String[]>(variables, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String[]>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = "/handlerMethod3/{variable1}/{variable2}/{variable3}")
	public ResponseEntity<Map<String, Object>> handlerMethod3(@PathVariable Map<String, Object> variables){
		ResponseEntity<Map<String, Object>> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<Map<String,Object>>(variables, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<Map<String,Object>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
	@GetMapping(path = {"/handlerMethod4/{variable}", "/handlerMethod4"})
	public ResponseEntity<String> handlerMethod4(@PathVariable(required = false) String variable){
		ResponseEntity<String> responseEntity = null;
		try {
			responseEntity = new ResponseEntity<String>(variable, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
	
}
