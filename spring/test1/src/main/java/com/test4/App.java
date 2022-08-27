package com.test4;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test4.a;

public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"config.xml","config1.xml","config2.xml","com/test4/config4.xml"});
        a student1=(a) context.getBean("a1");
        System.out.println( student1);
        //System.out.println( student1.getX());
        //System.out.println( student1.getObj().getD());
    }
}
