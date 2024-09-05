package com.mbi.customer.on.boarding.system.gmailservices;

import java.util.UUID;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component("generateBusinessKey")
public class GenerateBusinessKey implements ExecutionListener {

	@Override
	public void notify(DelegateExecution execution) throws Exception {
	
		    UUID uuid=UUID.randomUUID();
		    execution.setProcessBusinessKey("My order:"+uuid.toString());
		    String timestamp = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
	        String customIdentifier = "YOUR_CUSTOM_IDENTIFIER";
	        String businessKey = "Business Key : " + customIdentifier + "-" + timestamp;
	        execution.setProcessBusinessKey(businessKey);
	        System.out.println(execution.getBusinessKey());
	        System.out.println("Welcome to Customer onboarding system...");
	        System.out.println("Submit Application Form.");

	}

}
