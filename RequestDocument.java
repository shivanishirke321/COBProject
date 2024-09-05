package com.mbi.customer.on.boarding.system;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;
@Component("requestDocument")
public class RequestDocument implements JavaDelegate {
	
	private final Logger LOGGER = Logger.getLogger(RequestDocument.class.getName());

	public void execute(DelegateExecution execution) throws Exception {

		LOGGER.info("Please attach the additional documents for verification");
	}

}
