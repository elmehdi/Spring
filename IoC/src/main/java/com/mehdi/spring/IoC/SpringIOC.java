package com.mehdi.spring.IoC;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration // Use this SpringIOC class ad the configuration class / a bean configuration class
@ComponentScan("com.mehdi.spring.IoC")
public class SpringIOC {
    public static void main(String[] args) {

        /*
        // step 1
        Computer computer = new Computer(); // the Computer object - I, the developer has created this object, nobody did it for me
        // step 2
        Keyboard keyboard = new Keyboard();
        // step 3
        computer.setKeyboard(keyboard); // dependency set by the dev
       */
        ///  to perform step 2 & 3 with spring => in the Computer use @Autowired for the setter

        // -- I don't want to do this myself:  Computer computer = new Computer(); I will ask spring --- //

        // creating the container
        ApplicationContext container = new AnnotationConfigApplicationContext(SpringIOC.class); // the container is created out of a bean conf file - in this case with @Configuration
                                                                                 // The container will read this conf and will create beans/objects accordingly.
        // The conf in this case is this class SpringIOC.class (passed in parameters)
        // without a refresh. The container has no bean to provide! // it is done once we configure the app - if after 2 years you read this and didn't understand you have 2 options :
        /*
        option 1 : skip it, not a big deal.
        Option 2 : remove SpringIOC.class from the context param and the @Configuration annotation and find out again.
        NOTE : I read this comment one week later and can't remember what it was about LOL!
        * */


        // I can comment these 2 lines and see the logs from constructors, meaning the container loaded them
        Computer computer = container.getBean(Computer.class); // get me the computer class object
        computer.start();
    }
}
