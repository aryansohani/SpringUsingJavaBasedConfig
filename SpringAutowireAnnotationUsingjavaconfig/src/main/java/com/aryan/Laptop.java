package com.aryan;

import org.springframework.stereotype.Component;

@Component("lappy")
public class Laptop implements Computer{

    public void runcpu()
    {
        System.out.println("Laptop is running");
    }

    public Laptop()
    {
        System.out.println("object of laptop");
    }
}
