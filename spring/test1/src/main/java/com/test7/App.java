package com.test7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context =new AnnotationConfigApplicationContext(Config.class)  ;
        Student student1=(Student) context.getBean("getStudent",Student.class);
        System.out.println( student1 );
        //student1.study();
        SpelExpressionParser temp= new SpelExpressionParser();
        Expression expression=temp.parseExpression("56/7+13");
        System.out.println( expression.getValue() );
        
    }
}
