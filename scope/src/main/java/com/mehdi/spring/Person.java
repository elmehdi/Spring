package com.mehdi.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") // singleton by default - we can remove the Annotation in this case
// singleton is Eager (creates beans instantly when creating the container except if @lazy is used)
@Scope("prototype") // new bean each time we ask the container for the bean
// when it is prototype, the beans are not immediately created aka @Lazy)
public class Person {

    private String name;

    private String role;

    public void printPersonInfo(){
        System.out.println("name: " + name + " role: " + role);

    }
}
