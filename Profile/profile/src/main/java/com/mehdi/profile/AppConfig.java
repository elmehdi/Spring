package com.mehdi.profile;

import com.mehdi.profile.service.PaymentGateway;
import com.mehdi.profile.service.PaymentProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PaypalConfig.class, VisaConfig.class})
// @ComponentScan // not needed - not scanning for any beans, am creating them manually.
public class AppConfig {

    @Bean
    public PaymentProcessor paymentProcessor(PaymentGateway paymentGateway){ // it gonna get one of the PaymentGateway based on the active profile
        return new PaymentProcessor(paymentGateway);
    }
}
