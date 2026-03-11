package com.aryan;

import com.aryan.Appconfig.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Desktop dt = context.getBean(Desktop.class);
        dt.compile();
        Laptop lap=context.getBean(Laptop.class);
        lap.start();

    }
}
