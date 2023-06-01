package com.aop.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log { // aspect for logging
    @Before("execution(void com.aop.vehicles.Car.drive())") // pointcut expression
    public void logBeforeExecution(){
        System.out.println("AOP LOG before method execution.");
    }

    @After("execution(void com.aop.vehicles.Car.drive())")
    public void logAfterExecution(){
        System.out.println("AOP LOG after drive method execution");
    }
}
