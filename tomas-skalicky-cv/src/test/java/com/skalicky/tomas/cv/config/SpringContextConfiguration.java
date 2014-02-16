package com.skalicky.tomas.cv.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = SpringContextConfiguration.APPLICATION_BASE_PACKAGE)
public class SpringContextConfiguration {

    static final String APPLICATION_BASE_PACKAGE = "com.skalicky.tomas.cv";
}
