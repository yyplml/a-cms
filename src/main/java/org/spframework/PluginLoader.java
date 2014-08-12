package org.spframework;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;


public final class PluginLoader extends ApplicationObjectSupport {

	private static PluginLoader _loader;

	public static PluginLoader Singleton() {
		System.out.println("+++++++++++++++++++++++");
		if (_loader == null)
			_loader = new PluginLoader();
		return _loader;
	}

	public PluginLoader() {
		// applicationContext = new ClassPathXmlApplicationContext(
		// "applicationContext.xml");
		// applicationContext.
		// 获取bean工厂并转换为DefaultListableBeanFactory
		// 将applicationContext转换为ConfigurableApplicationContext

		System.out.println("-------------------");
		System.out
				.println(super.getApplicationContext() instanceof ConfigurableApplicationContext);

		ConfigurableApplicationContext configurableApplicationContext = (ConfigurableApplicationContext) super
				.getApplicationContext();

		ConfigurableBeanFactory configurableBeanFactory = configurableApplicationContext
				.getBeanFactory();
		DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) configurableBeanFactory;

		// // 通过BeanDefinitionBuilder创建bean定义
		// BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder
		// .genericBeanDefinition(PluginConfiguration.class);
		// // 设置属性userAcctDAO,此属性引用已经定义的bean:userAcctDAO
		// beanDefinitionBuilder.addPropertyReference("PluginConfiguration",
		// "PluginConfiguration");
		//
		// // 注册bean
		// defaultListableBeanFactory.registerBeanDefinition(
		// "PluginConfiguration",
		// beanDefinitionBuilder.getRawBeanDefinition());

	}
}
