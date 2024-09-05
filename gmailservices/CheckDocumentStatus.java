package com.mbi.customer.on.boarding.system.gmailservices;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;
@Component("checkDocumentStatus")
public class CheckDocumentStatus implements ExecutionListener {
	 private final Logger LOGGER = Logger.getLogger(CheckDocumentStatus.class.getName());
	@Override
	public void notify(DelegateExecution execution) throws Exception {
		String application_status="approved";
		execution.setVariable("application_status", application_status);
		
	}

}
