package com.medox.app.ws.app.ws.responses;

public enum MessageException {

	MISSING_REQUIRED_FIELD("Missing required field."),
	RECORD_ALREADY_EXISTS("Record already exists."),
	INTERNAL_SERVER_ERROR("Internal medox server error"),
	NO_RECORD_FOUND("Record with provided is is not found");
	
	
	private String errorMessage;

	private MessageException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
