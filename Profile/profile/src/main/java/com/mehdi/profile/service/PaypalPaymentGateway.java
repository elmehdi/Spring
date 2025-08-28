package com.mehdi.profile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Paypal")
public class PaypalPaymentGateway implements PaymentGateway{
    @Override
    public void pay(int amount){
        System.out.println("Paypal payment gateway ...");
        System.out.println("Payment processing for amount = " + amount);
    }
}
