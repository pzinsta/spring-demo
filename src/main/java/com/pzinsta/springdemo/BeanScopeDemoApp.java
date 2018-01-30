package com.pzinsta.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {
        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        
        // retrieve bean from spring container
        Coach coach1 = context.getBean("myCoach", Coach.class);
        Coach coach2 = context.getBean("myCoach", Coach.class);
        
        System.out.println("Pointing to the same object: " + (coach1 == coach2));
        
        System.out.println(coach1);
        System.out.println(coach2);
    }

}
