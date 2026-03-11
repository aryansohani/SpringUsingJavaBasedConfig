package com.aryan;

public class Alien {

    private int age;
    private Computer comp;

    public void run()
    {
        comp.start();
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

    public Alien()
    {
        System.out.println("object of alien created");
    }

}
