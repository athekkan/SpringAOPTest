package com.aop;

import com.aop.config.AppConfig;
import com.aop.vehicles.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car myCar = context.getBean(Car.class);
        myCar.drive();
        ((AnnotationConfigApplicationContext) context).close();
    }
}