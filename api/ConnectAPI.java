package com.error.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.error.beans.BuildingDTO;
import com.error.beans.ErrorResponseDTO;
import com.error.customException.MyException;

@RestController
public class ConnectAPI {

	@PostMapping(value = "/connect/")
	public Object pullBuilding(@RequestBody BuildingDTO buildingDTO) {
		try {
			validate(buildingDTO);
		} catch (MyException e) {
			// TODO: handle exception
			ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
			errorResponseDTO.setError(e.getMessage());
			List<String> listErrors = new ArrayList<String>();
			listErrors.add("Detail error 1");
			listErrors.add("Detail error 2");
			errorResponseDTO.setDetailError(listErrors);
			return errorResponseDTO;
		}
		return null;
	}

	// this function return error
	public void validate(BuildingDTO buildingDTO) throws MyException {
		if (buildingDTO.getName() == null || buildingDTO.getName().equals("") || buildingDTO.getFloor() == null) {
			throw new MyException("message error in functoin validate");
		}
	}
}
