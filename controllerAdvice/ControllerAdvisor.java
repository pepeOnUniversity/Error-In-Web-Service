package com.error.controllerAdvice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.error.beans.ErrorResponseDTO;
import com.error.customException.MyException;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

	// catch error my exception
	@ExceptionHandler(MyException.class)
	public ResponseEntity<Object> handleMyException(MyException e, WebRequest request) {
		// create instance errorResponseDTO
		ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO();
		// set error
		errorResponseDTO.setError(e.getMessage());
		// create instance errorDetailsList to store list errors
		List<String> errorDetailsList = new ArrayList<String>();
		// add error
		errorDetailsList.add("Error Input Null");
		errorDetailsList.add("Error Detail 1");
		errorDetailsList.add("Error Detail 2");
		// set list errors
		errorResponseDTO.setDetailError(errorDetailsList);
		// return
		return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_GATEWAY);
	}
}
