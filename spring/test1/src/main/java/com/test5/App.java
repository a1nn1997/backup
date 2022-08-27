package com.test5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test5.Emp;

public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context =new ClassPathXmlApplicationContext(new String[] {"config.xml","config1.xml","config2.xml","com/test4/config4.xml","com/test5/config5.xml"});
        Emp1 student1=(Emp1) context.getBean("e",Emp1.class);
        System.out.println( student1);
        //System.out.println( student1.getX());
        //System.out.println( student1.getObj().getD());
    }
}
