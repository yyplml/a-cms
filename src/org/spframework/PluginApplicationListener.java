package org.spframework;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;


public class PluginApplicationListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(">>>>>>>PluginApplicationListener>>>>>");
		if (event instanceof ContextRefreshedEvent) {
			init();
		}
	}

	public PluginApplicationListener() {
		// TODO Auto-generated constructor stub
	}

	private void init() {
		System.out.println(">>>>>>>PluginApplicationListener>>>>>");
	}

}
