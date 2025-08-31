package com.error.beans;

import java.util.List;

public class ErrorResponseDTO {
	private String error;
	private List<String> detailError;

	/**
	 * @return the error
	 */
	public String getError() {
		return error;
	}

	/**
	 * @return the detailError
	 */
	public List<String> getDetailError() {
		return detailError;
	}

	/**
	 * @param detailError the detailError to set
	 */
	public void setDetailError(List<String> detailError) {
		this.detailError = detailError;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) {
		this.error = error;
	}

}
