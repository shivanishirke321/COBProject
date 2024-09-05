package com.mbi.customer.on.boarding.system.gmailservices;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
@Component("rejectApplication")
public class RejectApplication implements JavaDelegate{
	private final Logger LOGGER = Logger.getLogger(RejectApplication.class.getName());
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		GmailSender gEmailSender = new GmailSender();
        String to = "shirkeshivani05@gmail.com";
        String from = "shivanishirke321@gmail.com";
        String subject = "Second: Sending email using GMail";
        String text = "After careful consideration and review, "
        			+ "we regret to inform you that your application has been declined.";
        boolean b = gEmailSender.sendEmail(to, from, subject, text);
        if (b) {
            LOGGER.info("Email is sent successfully");
        } else {
        	LOGGER.info("There is problem in sending email");
        }
  }
}
