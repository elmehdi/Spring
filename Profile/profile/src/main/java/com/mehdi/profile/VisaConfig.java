package com.mehdi.profile;

import com.mehdi.profile.service.PaymentGateway;
import com.mehdi.profile.service.VisaPaymentGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("Visa")
public class VisaConfig { // whatever beans I create here will be mapped to this profile
    @Bean
    public PaymentGateway paymentGateway(){
        return new VisaPaymentGateway();
    }
}
