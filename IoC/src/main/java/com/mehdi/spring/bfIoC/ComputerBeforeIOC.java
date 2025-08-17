package com.mehdi.spring.bfIoC;

public class ComputerBeforeIOC {
    // Dependency to Keyboard
    // this is a dependency injected by the developer aka me ^_-
    // Type 1 (normal)
//    Keyboard keyboard = new Keyboard(); // And this is Property Injection

    // Type 2 setter injection
    KeyboardBeforeIOC keyboard;

    public void setKeyboard(KeyboardBeforeIOC keyboard) {
        this.keyboard = keyboard;
    }

    public void start(){
        System.out.println("Starting the computer ...");
        keyboard.plugIn();
    }
}
