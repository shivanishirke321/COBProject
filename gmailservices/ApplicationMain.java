package com.mbi.customer.on.boarding.system.gmailservices;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
@Component("applicationMain")

public class ApplicationMain implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		GmailSender gEmailSender = new GmailSender();
        String to = "shirkeshivani05@gmail.com";
        String from = "shivanishirke321@gmail.com";
        String subject = "Request Document";
        String text = "Reminder: Please send the additional documents for verification";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            System.out.println("Email is sent successfully");
        } else {
            System.out.println("There is problem in sending email");
        }


		
	}

}
