package com.lift.rest.server.initializers;

import java.io.File;
import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;


public class RestServerInitializer implements ServletContainerInitializer {
	
	@Override
	public void onStartup(Set<Class<?>> clazzSet, ServletContext servletContext) throws ServletException {
		
		System.out.println("rest");
	}
	
	
}
