package com.mehdi.spring.bfIoC;

public class BeforeIOC {
    public static void main(String[] args) {
        // let's pretend the Score class has complex configuration & complicated lifecycle management
        // we will have the spring ioc container manages it (the lifecycle)

        // 1. Create an instance of spring framework
        /*
            this is an interface: ApplicationContext
            this is an implementation of the interface: AnnotationConfigApplicationContext - this is good for reading annotations.
            we need to tell the context what classes you are going to manage: Score.class
                    ApplicationContext spring = new AnnotationConfigApplicationContext(Score.class);

        * */


        // ------------------------------------------ NEW Example --------------------------------------------------------------- //

        // step 1
        ComputerBeforeIOC computer = new ComputerBeforeIOC(); // the Computer object - I, the developer has created this object, nobody did it for me
        // step 2
        KeyboardBeforeIOC keyboard = new KeyboardBeforeIOC();
        // step 3
        computer.setKeyboard(keyboard); // dependency set by the dev

        computer.start(); // whenever I want to use a method ex: the start method I need first create the object Computer

        // ---- the Spring IOC doesn't want us me to do those 3 steps. ---- /
        // ---- Spring will take the responsibility of creating the objects for me (Computer, Keyboard) ---- //
        // ---- Spring doesn't want me to do any dependency injection ---- //
        // ---- when Spring will create the computer object for me, Spring will take care of the dependency injection ---- //
        // ---- when Spring creates an object for the developer, it checks if it has any dependencies it will inject them over here ---- //
        // ---- I don't have to create the dependency object (Keyboard) and do not have to set the dependency object (setKeyboard) ---- //
    }
}
