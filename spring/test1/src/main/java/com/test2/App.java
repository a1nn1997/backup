package com.test2;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test2.Students;
public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext("config1.xml");
        Students student1=(Students) context.getBean("student1");
        System.out.println( student1.getProps().getClass().getName() );// get Type of class
        System.out.println( student1.getProps().getClass() );//GET class
        System.out.println( student1);
    }
}
