package com.mehdi.spring.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// I will use the @component: tell spring to create the object for me.
// spring will keep it inside a container
@Component
public class Computer {

    Computer(){
        System.out.println("Object of Computer created");
    }
    Keyboard keyboard; // Does not mean injected anything


    // Setter injection
    @Autowired // this is where the injection happens
    public void setKeyboard(Keyboard keyboardInjected) {
        System.out.println("calling the set method for DI");
        this.keyboard = keyboardInjected; // Spring injects a dependency (keyboardInjected) in the Computer's keyboard field.
    }

    public void start(){
        System.out.println("Starting the computer ...");
        keyboard.plugIn();
    }
}
