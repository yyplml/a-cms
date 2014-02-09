package org.sing.sp.concurrency.framework;

/**
 * 并发指令
 * 
 * @author sing.z
 * 
 */
public interface IConcurrencyCommand {

	boolean verify();

	boolean run();

	void done();

	void cancel();
}
