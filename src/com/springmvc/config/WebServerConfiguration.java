package com.springmvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/**
 *   Web.xml
 *   
 *	 Java Based Configuration file to replace the web.xml
 */
public class WebServerConfiguration implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		// identifying java configuration file we created to replace appconfig.xml
		AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();
		wac.register(WebApplicationConfiguration.class);
		
		// identifying xml configuration file 
//		XmlWebApplicationContext webAppContext = new XmlWebApplicationContext();
//		webAppContext.setConfigLocation("classpath:/appconfig.xml");
		
		//Create Dispatcher Servlet
		DispatcherServlet myDispatcher = new DispatcherServlet(wac);
		
		//Register Dispatcher Servlet 
		ServletRegistration.Dynamic servlet = servletContext.addServlet("appconfig", myDispatcher);
		
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/*");
	}

}
