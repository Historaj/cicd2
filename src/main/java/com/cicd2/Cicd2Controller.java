package com.cicd2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Cicd2Controller {
	
	@GetMapping("show/{name}")
	public ResponseEntity<Object> show(@PathVariable String name) {
		
		String msg = "Hello, Welcome this is main branch: " + name;
		return new ResponseEntity<Object>(msg, HttpStatus.OK); 
	}
}
