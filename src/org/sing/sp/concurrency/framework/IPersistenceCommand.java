package org.sing.sp.concurrency.framework;

import org.springframework.context.ApplicationContext;

public interface IPersistenceCommand {
	void run(ApplicationContext context);
	
}
 