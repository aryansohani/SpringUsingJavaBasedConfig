package com.aryan;

import com.aryan.JavaBasedConfiguration.JavaConfigapp;
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
        ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfigapp.class);
//        Desktop d= (Desktop)context.getBean("desk"); //if no name mentioned default name = name of method in these case method = desk to deafault name is desk of bean
//        d.compile();

        Desktop d1=(Desktop)context.getBean("Desktop1"); //we mentioned Desktop1 as name using @Bean(name="")
        d1.compile();

        Laptop l=context.getBean("lappy",Laptop.class);   //For bean laptop we mentioned array of name using @Bean(name={"",""})
        l.start();

        Laptop l1=context.getBean("laptop1",Laptop.class); //all names mentioned in array works
        l1.start();



    }
}
