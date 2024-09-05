package com.mbi.customer.on.boarding.system.gmailservices;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("customerOnboarded")
public class CustomerOnboarded implements JavaDelegate {
	private final Logger LOGGER = Logger.getLogger(CustomerOnboarded.class.getName());
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		GmailSender gEmailSender = new GmailSender();
        String to = "shirkeshivani05@gmail.com";
        String from = "shivanishirke321@gmail.com";
        String subject = "Second: Sending email using GMail";
        String text = "Congratulations! We are delighted to inform you that "
        				+ "your application has been approved, "
        				+ "and your account is now active. Welcome aboard!";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            LOGGER.info("Email is sent successfully");
        } else {
        	LOGGER.info("There is problem in sending email");
        }
	
		
	}

}
