package org.spframework.concurrency;

import org.springframework.context.ApplicationContext;

public interface IPersistenceCommand {
	void run(ApplicationContext context);
	
}
 