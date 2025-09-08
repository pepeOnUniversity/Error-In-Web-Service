package com.error.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.error.beans.BuildingDTO;

@RestController
public class ConnectAPI {

	@PostMapping(value = "/connect/")
	public Object pullBuilding(@RequestBody BuildingDTO buildingDTO) {
		// this error ==> ping controlle advice
		System.out.println(5 / 0);
		return null;
	}

}
