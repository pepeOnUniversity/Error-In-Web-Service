package com.error.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.error.beans.ErrorResponseDTO;

@RestController
public class ConnectAPI {
	@GetMapping(value = "/connect")
	public Object connect() {
		try {
			System.out.println(5 / 0);
		} catch (Exception e) {
			// in this case, i use my exception to handle error
			// advantage of this way, it return clear and exactly error for client
			ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
			errorResponseDTO.setError("error arithmetic");
			List<String> listErrors = new ArrayList<String>();
			listErrors.add("error division by 0");
			listErrors.add("test error");
			errorResponseDTO.setDetailError(listErrors);
			return errorResponseDTO;
		}
		return null;
	}
}
