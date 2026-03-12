package com.aryan.Configurations;
import com.aryan.Alien;
import com.aryan.Computer;
import com.aryan.Desktop;
import com.aryan.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

    @Bean
    public Alien alien( @Qualifier("desk") Computer comp) //When we use @Qualifier("desk") it will create object of desk as computer
    {
        Alien obj = new Alien();
        obj.setAge(24);
        obj.setComp(comp);
        return obj;
    }

    @Bean
    public Desktop desk()
    {
        return new Desktop();
    }

    @Bean
    @Primary              //when we use @primary it will prioritize the object creation of laptop
    public Laptop lap()
    {
        return new Laptop();
    }


}
//if qualifier is mentioned primary won't work
//primary works when the things are default and not explicitly mentioned