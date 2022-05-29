package com.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springmvc.controllers")
public class WebApplicationConfiguration {
	/**
	 *  Java Based configuration file which replaces appconfig.xml
	 *  
	 */
}
