package com.mehdi.spring.IoC;

import org.springframework.stereotype.Component;

@Component
public class Keyboard {

    Keyboard(){
        System.out.println("Keyboard class object created");
    }
        public void plugIn() {
            System.out.println("plugging in keyboard ...");
        }
}
