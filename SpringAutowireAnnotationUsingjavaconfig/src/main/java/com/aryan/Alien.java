package com.aryan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("alien")
public class Alien {

    private int age;

    @Autowired
//    @Qualifier("desktop") // default name (Desktop=desktop) all small of class
    @Qualifier("lappy")
    private Computer comp;

    public void run()
    {
        comp.runcpu();
    }
    public Alien()
    {
        System.out.println("object of alien");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
