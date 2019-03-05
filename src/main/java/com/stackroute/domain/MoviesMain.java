package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MoviesMain {
    public static void main(String[] args) {
        //Task-1 & Task-2 using ApplicationContext
        ApplicationContext bean=new ClassPathXmlApplicationContext("bean.xml");

        //Task-1
        Movie movie1=(Movie)bean.getBean("bean-1");
        System.out.println(movie1.getActor());

        // Task-2
        Movie movie2=(Movie)bean.getBean("bean-2");
        System.out.println(movie2.getActor());
    }

}