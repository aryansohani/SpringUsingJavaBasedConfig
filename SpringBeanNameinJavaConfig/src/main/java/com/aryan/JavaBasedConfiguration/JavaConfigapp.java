package com.aryan.JavaBasedConfiguration;

import com.aryan.Desktop;
import com.aryan.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigapp {

    @Bean(name="Desktop1")     //(name ="") is used to mentioned the name of bean
    public Desktop desk()
    {
        return new Desktop();
    }

    @Bean(name={"lap1","lappy","laptop1"}) //(name={"",""}) is used when you want to mention multiple names
    public Laptop lap()
    {
        return new Laptop();
    }

}
