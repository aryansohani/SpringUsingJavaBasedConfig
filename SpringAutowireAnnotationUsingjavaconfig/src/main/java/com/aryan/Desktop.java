package com.aryan;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public void runcpu()
    {
        System.out.println("Desktop is running");
    }

    public Desktop()
    {
        System.out.println("object of desktop");
    }
}
