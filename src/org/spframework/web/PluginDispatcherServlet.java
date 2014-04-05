package org.spframework.web;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.web.servlet.DispatcherServlet;

public class PluginDispatcherServlet extends DispatcherServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>1>>>>>>>>>>>>>>>>>>");
		super.onApplicationEvent(event);
		logger.debug(">>>>>>PluginDispatcherServlet>>>>>");
	}

	@Override
	public void onRefresh(ApplicationContext context) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>2>>>>>>>>>>>>>>>>>>>");
		this.loadPlubin(context);

		super.onRefresh(context);
	}

	private void loadPlubin(ApplicationContext context) {
		System.out.println("-------------------");
		System.out.println(context instanceof ConfigurableApplicationContext);

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
