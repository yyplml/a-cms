package org.spframework.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.servlet.DispatcherServlet;

public class PluginDispatcherServlet  {
	private Log logger = LogFactory.getLog(PluginDispatcherServlet.class);
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		logger.debug(">>>>>>>>>>>>>>>>>>>>>>>plugin applcation event>>>>>>>>>>>>>>>>>>");
		//super.onApplicationEvent(event);
		logger.debug(">>>>>>PluginDispatcherServlet>>>>>");
	}

	//@Override 
	public void onRefresh(ApplicationContext context) {
		logger.debug(">>>>>>>>>>>>>>>>>>>>>>plugin refresh >>>>>>>>>>>>>>>>>>>");
		this.loadPlugin(context);

		//super.onRefresh(context);
	}

	private void loadPlugin(ApplicationContext context) {
		logger.debug("------load plugin-------------");
		logger.debug(context instanceof ConfigurableApplicationContext);

		ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) context;

		ConfigurableBeanFactory configurableBeanFactory = configurableApplicationContext
				.getBeanFactory();
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableBeanFactory;

		// 通过BeanDefinitionBuilder创建bean定义
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder
				.genericBeanDefinition(org.acms.plugins.graphiccontent.GrphicContentController.class);

		// 注册bean
		defaultListableBeanFactory.registerBeanDefinition(
				"GrphicContentController",
				beanDefinitionBuilder.getRawBeanDefinition());
	}
}
