package com.aryan.Configuration;

import com.aryan.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    @Scope("prototype")
    public Desktop desk()
    {
        return new Desktop();
    }

}
//@Scope("prototype") creates new object everytime the context.getBean() is called
//by default the scope is singleton i.e. spring created a single object for multiple reference variables
