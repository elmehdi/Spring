package com.mehdi.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class Teacher
        //implements InitializingBean
{
    private List<String> subjects;

    Teacher(){
        System.out.println("Teacher init ...");
    }

    // I want this method to be called whenever the Teacher object will be created by Spring
    // Be called automatically by Spring after the bean is instantiated and its dependencies are injected (i.e., after dependency injection is complete but before the bean is fully available for use).
    // @PostConstruct // hadi jaya mn dik dependency li zedna (jakarta annotaion)
    // this @PostConstruct makes sure that my method will get called
    public void init(){
        System.out.println("init Invoked through @PostConstruct annotation");
        subjects = new ArrayList<String>();
        subjects.add("French");
        subjects.add("Math");
        subjects.add("OOP");
    }

    public void init2(){
        System.out.println("init2 Invoked ");
        subjects = new ArrayList<String>();
        subjects.add("Spanish");
        subjects.add("Physics");
        subjects.add("UML");
    }

    public void teach(){
        System.out.println("teaching ...");
        for (String sub : subjects)
        {
            System.out.println(sub);
        }
    }

//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiesSet method");
//    }
}
