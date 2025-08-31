package com.error.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectAPI {
	@GetMapping(value = "/Connect")
	// in FE, the URL is /connect => different in url
	public void connect() {
		System.out.println("error 404 NOT FOUND");
	}
}
