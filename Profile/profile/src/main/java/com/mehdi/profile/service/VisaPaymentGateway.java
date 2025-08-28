package com.mehdi.profile.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
//@Primary
// Hey spring! do me a favor : if the Visa Profile is activated create a bean for this
@Profile("Visa")
public class VisaPaymentGateway implements PaymentGateway{
    @Override
    public void pay(int amount){
        System.out.println("Visa payment gateway ...");
        System.out.println("Payment processing for amount = " + amount);
    }
}
