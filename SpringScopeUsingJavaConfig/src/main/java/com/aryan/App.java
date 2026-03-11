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
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Desktop dt= context.getBean("desk",Desktop.class);
        dt.run();

        Desktop dt2=context.getBean("desk",Desktop.class);
        dt2.run();
    }
}
