package com.disney.cxftest.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.disney.cxftest.data.LocationData;

@Controller
@RequestMapping("/complextype")
public class ComplexTypeTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(LocationData loc ) {

		logger.debug(loc.getLocation());

		return "locationClient";
		
	}
	
}
