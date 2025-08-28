package com.mehdi.profile;

import com.mehdi.profile.service.PaymentGateway;
import com.mehdi.profile.service.PaypalPaymentGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Paypal")
public class PaypalConfig {
    @Bean
    public PaymentGateway paymentGateway() {
        return new PaypalPaymentGateway();
    }
}
