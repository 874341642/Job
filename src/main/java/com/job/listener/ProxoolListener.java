package com.job.listener;

import java.io.File;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.logicalcobwebs.proxool.ProxoolException;
import org.logicalcobwebs.proxool.configuration.JAXPConfigurator;
import org.logicalcobwebs.proxool.configuration.PropertyConfigurator;

public class ProxoolListener implements ServletContextListener {

	private static final String XML_FILE_PROPERTY = "xmlFile";
	private static final String PROPERTY_FILE_PROPERTY = "propertyFile";
	private static final String AUTO_SHUTDOWN_PROPERTY = "autoShutdown";
	private boolean autoShutdown = true;

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("destroy database pool....");
	}

	public void contextInitialized(ServletContextEvent contextEvent) {
		ServletContext context = contextEvent.getServletContext();
		String appDir = contextEvent.getServletContext().getRealPath("/");
		Properties properties = new Properties();
		Enumeration<?> names = context.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			String value = context.getInitParameter(name);
			if (name.equals(XML_FILE_PROPERTY)) {
				try {
					File file = new File(value);
					if (file.isAbsolute()) {
						JAXPConfigurator.configure(value, false);
					} else {
						JAXPConfigurator.configure(appDir + File.separator + value, false);
					}
				} catch (ProxoolException e) {
					e.printStackTrace();
				}
			} else if (name.equals(PROPERTY_FILE_PROPERTY)) {
				try {
					File file = new File(value);
					if (file.isAbsolute()) {
						PropertyConfigurator.configure(value);
					} else {
						PropertyConfigurator.configure(appDir + File.separator + value);
					}
				} catch (ProxoolException e) {
					e.printStackTrace();
				}
			} else if (name.equals(AUTO_SHUTDOWN_PROPERTY)) {
				autoShutdown = Boolean.valueOf(value).booleanValue();
				System.out.println("autoShutdown==" + autoShutdown);
			} else if (name.startsWith("jdbc")) {
				properties.setProperty(name, value);
			}
		}
		if (properties.size() > 0) {
			try {
				PropertyConfigurator.configure(properties);
			} catch (ProxoolException e) {
				e.printStackTrace();
			}
		}

	}

}
