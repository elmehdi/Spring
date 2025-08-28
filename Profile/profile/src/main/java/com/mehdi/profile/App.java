package com.mehdi.profile;

import com.mehdi.profile.service.PaymentProcessor;
import com.mehdi.profile.service.PaypalPaymentGateway;
import com.mehdi.profile.service.VisaPaymentGateway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();


        container.getEnvironment().setActiveProfiles("Visa"); // Activating the profile
        String[] profiles =     container.getEnvironment().getActiveProfiles();

        container.register(AppConfig.class);// the container will be created from that AppConfig
        container.refresh();
        /*
        * Problem: Registering a configuration class doesn’t automatically initialize the container.
        * The container needs to process the registered configuration, scan for beans, inject dependencies, and complete the bean lifecycle.
            Solution: Calling refresh() explicitly tells the container to:
            Load bean definitions from AppConfig.class (e.g., @Bean methods or component-scanned @Component classes).
         */
        container.getBean( PaymentProcessor.class).doPayment(120);
        System.out.println(container.getBean(PaymentProcessor.class).getPg());
        for (String profile : profiles) {
            if (profile.equals("Visa") )
                container.getBean(VisaPaymentGateway.class);
            else
                container.getBean(PaypalPaymentGateway.class);
        }

    }
}
