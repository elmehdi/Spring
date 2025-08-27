package com.mehdi.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppcConfig {

    @Bean(initMethod = "init2")
    public Teacher teacher2(){
        return new Teacher();
    }
}
