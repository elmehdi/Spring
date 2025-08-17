package com.mehdi.spring.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//@Configuration // Use this SpringIOC class ad the configuration class / a bean configuration class
//@ComponentScan("com.mehdi.spring")

@SpringBootApplication // embeds the annotations above
public class SpringBoot {
    public static void main(String[] args) {

        // creating the container
        // ApplicationContext container = new AnnotationConfigApplicationContext(SpringIOC.class); // the container is created out of a bean conf file - in this case with @Configuration
                                                                                 // the container will read this conf and will create beans/objects accordingly
        // we can replace this line: ApplicationContext container = new AnnotationConfigApplicationContext(SpringIOC.class);
        SpringApplication springApplication = new SpringApplication(SpringBoot.class);
        ApplicationContext container = springApplication.run();
        // I can comment these 2 lines and see the logs from constructors, meaning the container loaded them
        Computer computer = container.getBean(Computer.class); // get me the computer class object
        computer.start();
    }
}
