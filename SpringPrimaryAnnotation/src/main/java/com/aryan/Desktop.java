package com.aryan;

import org.springframework.stereotype.Component;

@Component("Desktop")
public class Desktop implements Computer{

    public void runcpu()
    {
        System.out.println("The Desktop is running");
    }
    public Desktop()
    {
        System.out.println("Desktop object created");
    }
}
