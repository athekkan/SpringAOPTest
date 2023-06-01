package com.aop.config;

import com.aop.vehicles.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.aop")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Car getCar(){
        return new Car();
    }
}
