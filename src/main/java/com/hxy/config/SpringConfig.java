package com.hxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.hxy")
@PropertySource("jdbc.properties")
public class SpringConfig   {
}
