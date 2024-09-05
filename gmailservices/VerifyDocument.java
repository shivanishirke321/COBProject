package com.mbi.customer.on.boarding.system.gmailservices;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;


@Component("verifyDocument")
public class VerifyDocument implements JavaDelegate{
	 private final Logger LOGGER = Logger.getLogger(VerifyDocument.class.getName());

		@Override
		public void execute(DelegateExecution execution) throws Exception {
			String documentVerificationStatus="true";
			execution.setVariable("documentVerificationStatus", documentVerificationStatus);
		
		
	}

}
