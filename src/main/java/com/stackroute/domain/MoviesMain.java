package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MoviesMain {
    public static void main(String[] args) {
        ApplicationContext bean=new ClassPathXmlApplicationContext("bean.xml");

        //Task-1
        Movie movie1=(Movie)bean.getBean("movie1");
        System.out.println(movie1.getActor());

        // Task-2
        Movie movie2=(Movie)bean.getBean("movie1");
        System.out.println(movie2.getActor());
        System.out.println(movie1==movie2);

        // Task-1 using xmlBeanFactory
        XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("bean.xml"));
        Movie movie =(Movie)factory.getBean("movie1");
        System.out.println(movie.getActor());
    }
}