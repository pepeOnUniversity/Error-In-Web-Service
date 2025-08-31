package com.error.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectAPI {
	@GetMapping(value = "/connect")
	public void connect() {
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		// in this case, I use default exception
		// reality, BE occur error,
		// but server still run and return status code is 200 (ok)
		// however, I dont know exactly error because I dont return detail erorr
	}
}
