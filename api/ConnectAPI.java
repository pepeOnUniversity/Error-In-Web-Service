package com.error.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectAPI {
	@GetMapping(value = "/connect/")
	public void connect() {
		System.out.println("ok");
	}

}
