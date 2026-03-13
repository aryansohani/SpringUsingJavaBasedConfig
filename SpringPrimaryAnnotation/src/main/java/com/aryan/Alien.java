package com.aryan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("alien")
public class Alien {

    @Autowired
    @Qualifier("Desktop") //when we mention quantifier() it is explicitly so spring over look primary
    private Computer comp;     //when we dont mention anything which object we want that time spring goes with @primary bean

    public void start()
    {
        comp.runcpu();
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }
    public Alien()
    {
        System.out.println("object of alien");
    }
}
//eg, there are two bean aryan and saloni , saloni is marked as primary i.e fav
// when i say get me apply by default the saloni is selected to get apple cause she is marked primary
//when i say aryan get me apple i am mentioning aryan so even tho saloni is primary still aryan will get the apple