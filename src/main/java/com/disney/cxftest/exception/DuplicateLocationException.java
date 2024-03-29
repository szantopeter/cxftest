package com.disney.cxftest.exception;

import javax.ws.rs.core.Response.Status;

import com.disney.cxftest.exception.meta.LocationBaseException;

/**
 * Indicates if a location is already created
 * @author pszanto
 */
public class DuplicateLocationException extends LocationBaseException {

	private static final long serialVersionUID = -8212991366777389573L;

	public DuplicateLocationException() {

		super(Status.CONFLICT, "Location is already stored");
		
	}
	
}
