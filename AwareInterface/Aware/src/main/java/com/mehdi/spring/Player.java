package com.mehdi.spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

public class Player implements BeanNameAware {

    public Player(){
        System.out.println("Player initialisation .. ");
    }
    public void play()
    {
    }

    // a callback method - automatically called, and this name will be injected by spring automatically
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is : " + name);
    }
}
