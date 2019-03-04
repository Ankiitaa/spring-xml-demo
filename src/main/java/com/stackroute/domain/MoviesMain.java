package com.stackroute.domain;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MoviesMain {
    public static void main(String[] args) {
        ApplicationContext bean=new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext bean1=new ClassPathXmlApplicationContext("bean.xml");
        Movie movie1=(Movie)bean1.getBean("movie1");
        Movie movie =(Movie)bean.getBean("movie");
        System.out.println(movie.getActor());
        System.out.println(movie1.getActor());

    }
}