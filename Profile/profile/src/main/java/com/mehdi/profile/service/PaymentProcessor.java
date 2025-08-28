package com.mehdi.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessor {

    // @Autowired
    //@Qualifier("paypalPaymentGateway")
    PaymentGateway pg;

    public PaymentProcessor(PaymentGateway pg) {
        this.pg = pg;
    }

    public void doPayment(int amount){
        pg.pay(amount);
    }

    public PaymentGateway getPg() {
        return pg;
    }
}
