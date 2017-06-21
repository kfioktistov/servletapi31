package com.lessons.servlet.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.util.Set;

/**
 * Application configuration initialization
 */
public class AppInitializer implements ServletContainerInitializer {

    private static final Logger logger = LoggerFactory.getLogger(AppInitializer.class);

    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
        logger.info("onStartup");
    }

}
