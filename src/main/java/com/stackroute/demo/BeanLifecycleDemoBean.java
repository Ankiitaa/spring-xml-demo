package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializationBean init method called");
    }
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy method called");
    }
    public void display(){
        System.out.println("Life cycle of bean");
    }
    public void customInit(){
        System.out.println("This is custom init method");
    }
    public void customDestroy(){
        System.out.println("This is custom destroy method");
    }
}