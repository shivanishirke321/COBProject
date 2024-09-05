package com.mbi.customer.on.boarding.system;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SendReminderEmail implements JavaDelegate {
	private final Logger LOGGER = Logger.getLogger(SendReminderEmail.class.getName());
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		LOGGER.info("Please attach the additional documents for verification");
		
	}

}
