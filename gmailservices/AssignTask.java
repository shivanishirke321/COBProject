package com.mbi.customer.on.boarding.system.gmailservices;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;

@Component("assignTask")
public class AssignTask implements TaskListener{
	private final Logger LOGGER = Logger.getLogger(AssignTask.class.getName());
	@Override
	public void notify(DelegateTask delegateTask) {
		
		delegateTask.setAssignee("shivani");
		LOGGER.info("Check if the coupon code is available or not."+delegateTask.getAssignee());
		
		
	}

}
