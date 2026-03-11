package com.aryan.Appconfig;

import com.aryan.Desktop;
import com.aryan.Laptop;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Desktop desktop()
    {
        return new Desktop();
    }

    @Bean
    public Laptop lap()
    {
        return new Laptop();
    }
}
