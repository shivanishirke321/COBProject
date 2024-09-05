
package com.mbi.customer.on.boarding.system.databaseconnectivity;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveCustomerDelegate implements JavaDelegate {

    @Autowired
    private CustomerService customerService;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String fullName = (String) execution.getVariable("fullName");
        String contactNumber = (String) execution.getVariable("contactNumber");
        String address = (String) execution.getVariable("address");
        String adharCard = (String) execution.getVariable("adharCard");
        String panCardNumber = (String) execution.getVariable("panCardNumber");

        Customer customer = new Customer();
        customer.setFullName(fullName);
        customer.setContactNumber(contactNumber);
        customer.setAddress(address);
        customer.setAdharCard(adharCard);
        customer.setPanCardNumber(panCardNumber);

        customerService.saveCustomer(customer);
    }
}
