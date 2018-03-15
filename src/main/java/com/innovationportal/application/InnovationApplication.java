package com.innovationportal.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = "com.innovationportal.rest")
public class InnovationApplication {

    public static void main(String[] args){
        SpringApplication.run(InnovationApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args ->{
            System.out.println("Let's inspect the beans provided by Spring Boot");
            String[] beanNames = ctx.getBeanDefinitionNames();
            for(String beanName : beanNames){
                System.out.println(beanName);
            }
        };
    }
}
