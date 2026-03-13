package com.aryan;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary   //primary is used in class and quantifier in variable
public class Laptop implements Computer{

    public void runcpu()
    {
        System.out.println("The Laptop is running");
    }

    public Laptop()
    {
        System.out.println("laptop object created");
    }
}
