package com.mehdi.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        Person person1 = container.getBean("person", Person.class);
        System.out.println(person1); // Person@1677d1

        Person person2 = container.getBean("person", Person.class);
        System.out.println(person2); // Person@1677d1 - same hash

        //person1.printPersonInfo();

        if (person2 == person1)
            System.out.println("Objects are the same ");
        else
            System.out.println("Objects are not the same ");

        // new container
        ApplicationContext container2 = new AnnotationConfigApplicationContext(AppConfig.class);

        Person personA = container2.getBean("person", Person.class);
        System.out.println(personA); // Person@5ccddd20

        Person personB = container2.getBean("person", Person.class);
        System.out.println(personB); // Person@5ccddd20 - same hash (but only when the scope is singleton. If it is prototype we will get different objects)
    }
}
