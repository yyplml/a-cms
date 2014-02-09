package org.sing.sp.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PluginLoader {

	public ApplicationContext applicationContext;

	public PluginLoader() {
		applicationContext = new ClassPathXmlApplicationContext(
				"resources/application-config.xml");

	}

}
