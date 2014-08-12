package org.spframework.concurrency.processor;

import org.spframework.concurrency.ConcurrencyCommandBase;

/**
 * 指令处理器
 * 
 * @author sing.z
 * 
 */
public class CommandProcessor {

	private CommandQueue queue;

	public CommandProcessor setQueue(CommandQueue queue) {
		this.queue = queue;
		return this;
	}

	public void processing() {

		ConcurrencyCommandBase cmd;
		try {
			cmd = this.queue.takeCommand();

			if (!cmd.verify()) {

				return;
			}
			if (!cmd.run()) {

				return;
			}
			cmd.done();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
