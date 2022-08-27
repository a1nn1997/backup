package com.test1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        Student student1=(Student) context.getBean("student2");
        System.out.println( student1 );
        context.registerShutdownHook();
    }
}
