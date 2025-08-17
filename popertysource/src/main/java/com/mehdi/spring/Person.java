package com.mehdi.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Value("${name}")
    private String name;
    @Value("${role}")
    private String role;
    @Value("${exp}")
    private String exp; // this was set by using the VM arguments [More Run/Debug -> Modify Run Config -> Add VM options -> -Dexp=3years]
    @Value("${my_name}")
    private String my_name;

    @Value("${GEMINI_API_KEY}") // get this from the OS var Env
    private String username;
    public void printPersonInfo(){
        System.out.println("name: " + name + " role: " + role + " exp: " + exp + " my name is : " + my_name + " and username : " + username);

    }
}
