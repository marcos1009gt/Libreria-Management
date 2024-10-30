package com.example.libreria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

	@RequestMapping("prueba")
	public String WelcomeUser(@RequestParam(value="name", defaultValue="User") String name) {
		return "Hello "+name+"!!";
	}
}
