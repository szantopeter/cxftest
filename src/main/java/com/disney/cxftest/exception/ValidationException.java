package com.disney.cxftest.exception;

import java.util.Map;

import javax.ws.rs.core.Response.Status;

import com.disney.cxftest.exception.meta.LocationBaseException;

public class ValidationException extends LocationBaseException {

	private static final long serialVersionUID = -6353144184095941148L;

	public ValidationException(Map<String, String> data) {
		super(Status.BAD_REQUEST, "Validation failed", data);
	}

}
