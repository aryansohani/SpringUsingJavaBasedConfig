package com.aryan;

import com.aryan.Configuration.JavaConfig;
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
        ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
        Alien a= context.getBean("alien",Alien.class);
        a.start();
    }
}
