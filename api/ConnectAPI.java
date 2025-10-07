package com.error.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.error.beans.BuildingDTO;
import com.error.customException.MyException;

@RestController
public class ConnectAPI {

	@PostMapping(value = "/connect/")
	public Object pullBuilding(@RequestBody BuildingDTO buildingDTO) {
		String nameString = buildingDTO.getName();
		int floor = buildingDTO.getFloor();
//		if (nameString == null) {
//			throw new MyException("Name không được null");
//		}

		if (floor > 10) {
			throw new MyException("The floor excess 10");
		}
		return null;
	}
}
