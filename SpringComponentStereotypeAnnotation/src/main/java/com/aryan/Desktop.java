package com.aryan;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public void startcpu()
    {
        System.out.println("Starting desktop");
    }
    public Desktop()
    {
        System.out.println("Object of computer");
    }
}
