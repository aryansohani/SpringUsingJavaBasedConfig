package com.aryan.Configuration;

import com.aryan.Alien;
import com.aryan.Computer;
import com.aryan.Desktop;
import com.aryan.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    public Alien alien(@Autowired Computer comp)
    {
        Alien obj= new Alien();
        obj.setAge(30);
        obj.setComp(comp);
        return obj;
    }

    @Bean
    @Scope("prototype")
    public Desktop desk()
    {
        return new Desktop();
    }

//    @Bean
//    @Scope("prototype")
//    public Laptop lap()
//    {
//        return new Laptop();
//    }
}
