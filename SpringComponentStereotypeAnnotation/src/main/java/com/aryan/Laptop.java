package com.aryan;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public void startcpu()
    {
        System.out.println("Laptop is starting");
    }
    Laptop()
    {
        System.out.println("these is object of laptop");
    }


}
