package com.spring.setterInjection.setterInjectionExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
    	ICar i1=(ICar) con.getBean("bm");
    	i1.drive();
    	
    	ICar i2=(ICar) con.getBean("ad");
    	i2.drive();
    }
}
