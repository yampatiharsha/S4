package com.klef.fsad.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        ApplicationContext context =
        new ClassPathXmlApplicationContext("spring.xml");

        Student s = (Student) context.getBean("stud");

        s.display();
    }
}