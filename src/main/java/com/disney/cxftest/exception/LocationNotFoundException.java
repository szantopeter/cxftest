package com.disney.cxftest.exception;

import javax.ws.rs.core.Response.Status;

import com.disney.cxftest.exception.meta.LocationBaseException;

public class LocationNotFoundException extends LocationBaseException  {

	private static final long serialVersionUID = 1154886234595592271L;
	
	public LocationNotFoundException() {
		
		super(Status.NOT_FOUND, "Location not found");
		
	}
	

}
