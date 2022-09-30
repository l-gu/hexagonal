package org.demo.myapp.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * SpringBoot application launcher
 * 
 * The "SpringBootApplication" annotation is combination of three annotations:
 *  - Configuration
 *  - EnableAutoConfiguration
 *  - ComponentScan
 *  
 * NB : The default "ComponentScan annotation" (without arguments) tells Spring to scan 
 * the current package and all of its sub-packages.
 *  1) place the Main Application class at the root of the project
 *     (this way, it will automatically scan and find the Controller)
 *  2) define explicitly the starting point using "ComponentScan" annotation
 */
@SpringBootApplication
//@ComponentScan(basePackages = { 
//	"org.demo.myapp.adapters.input.rest",
//	"org.demo.myapp.core",
//	"org.demo.myapp.adapters.output.db"
//})
@ComponentScan(basePackages = "org.demo.myapp") 
public class ApplicationStarter {

    public static void main(String[] args) {
    	Logger logger = LoggerFactory.getLogger(ApplicationStarter.class);
    	logger.info("*** Starting application ***");

        SpringApplication.run(ApplicationStarter.class, args);

        logger.info("*** Application started ***");
    }

}

