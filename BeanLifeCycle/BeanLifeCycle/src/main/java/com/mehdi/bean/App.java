package com.mehdi.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(AppcConfig.class);

        Teacher teacher = container.getBean("teacher2", Teacher.class);
        teacher.teach();
    }
}
