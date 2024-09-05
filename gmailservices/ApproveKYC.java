package com.mbi.customer.on.boarding.system.gmailservices;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
@Component("approveKYC")

public class ApproveKYC implements JavaDelegate {
	
  public static final String ACCOUNT_SID = "AC29f1f87235fdf9a1cb9c7e3eb229d3c8";
  public static final String AUTH_TOKEN = "e5028845d286f4db867bbdf7fc8bcde7";
 
  private final Logger LOGGER = Logger.getLogger(ApproveKYC.class.getName());
	@Override
 public void execute(DelegateExecution execution) throws Exception{
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    
    Message message = Message.creator(
      new com.twilio.type.PhoneNumber("whatsapp:+918208485418"),
      new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
      "We are pleased to inform you that your KYC (Know Your Customer) application has been approved! "
      + "Thank you for completing the necessary steps to verify your identity and comply with regulatory "
      + "requirements.").create();

    LOGGER.info("Message sent successfully. SID: " + message.getSid());
  }
}

