package com.aryan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("alien")
@Scope("prototype")
public class Alien {

    @Value("21")
    private int age;

    public void run()
    {
        System.out.println("The alien is running");
    }

    public int getAge() {
        return age;
    }

    public Alien()
    {
        System.out.println("object of alien");
    }
}
