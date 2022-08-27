package com.test6;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.test6.Student;

public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context =new ClassPathXmlApplicationContext(new String [] { "com/test6/config6.xml","com/test6/config61.xml"})  ;
        //Student student1=(Student) context.getBean("student");
        //Student student1=(Student) context.getBean("s");  //as s is specifically mentioned hence it is the best practices
        Demo student1=(Demo) context.getBean("d",Demo.class);
        System.out.println( student1 );
        SpelExpressionParser temp= new SpelExpressionParser();
        Expression expression=temp.parseExpression("56/7+13");
        System.out.println( expression.getValue() );
        
    }
}
