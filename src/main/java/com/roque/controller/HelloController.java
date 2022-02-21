package com.roque.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rafael-k8s-demo/v1")
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello rafael-k8s-demo";
	}
	
}
