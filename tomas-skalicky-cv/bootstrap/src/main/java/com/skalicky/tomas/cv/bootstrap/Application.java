package com.skalicky.tomas.cv.bootstrap;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { Application.APPLICATION_BASE_PACKAGE })
public class Application {

    static final String APPLICATION_BASE_PACKAGE = "com.skalicky.tomas.cv";

    private static final Logger LOGGER = Logger.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        logAllBeans(context);
    }

    private static void logAllBeans(ApplicationContext context) {

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            LOGGER.debug(beanName);
        }
    }
}
