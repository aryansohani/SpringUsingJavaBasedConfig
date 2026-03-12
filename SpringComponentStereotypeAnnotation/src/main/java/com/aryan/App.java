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
       Alien a1= context.getBean(Alien.class);
       Desktop dt= context.getBean(Desktop.class);
       Laptop lp=context.getBean(Laptop.class);
    }
}
