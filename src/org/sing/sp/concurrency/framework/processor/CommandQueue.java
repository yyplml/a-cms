package org.sing.sp.concurrency.framework.processor;

import org.sing.sp.concurrency.framework.ConcurrencyCommandBase;

public class CommandQueue {
	private static int defQueueSize = 10240;
	private int queueSize = 0;
	private int curAddQueueIndex = 0;
	private int curTakeQueueIndex = 0;

	private ConcurrencyCommandBase commands[];

	public CommandQueue() {
		this(defQueueSize);
	}

	public CommandQueue(int queueSize) {
		this.queueSize = queueSize;
		// 固定长度对列
		this.commands = new ConcurrencyCommandBase[this.queueSize];
	}

	public void addCommand(ConcurrencyCommandBase commands) throws Exception {
		// 实现环状对列，如蛇头咬蛇尾　
		if (this.commands[curAddQueueIndex] == null) {
			this.commands[curAddQueueIndex] = commands;
		} else {
			Thread.sleep(500);

			addCommand(commands);
		}

		curAddQueueIndex++;

		// 超出对列时归零，蛇头咬蛇尾,嘿嘿
		if (curAddQueueIndex >= queueSize)
			curAddQueueIndex = 0;
	}

	public ConcurrencyCommandBase takeCommand() throws Exception {
		System.out.println("wait to get command...");
		if (curTakeQueueIndex >= queueSize)
			curTakeQueueIndex = 0;

		ConcurrencyCommandBase cmdBase = this.commands[curTakeQueueIndex];
		if (cmdBase == null) {
			Thread.sleep(1000);
			return takeCommand();
		}

		ConcurrencyCommandBase cmd = cmdBase.clone();
		this.commands[curTakeQueueIndex] = null;
		curTakeQueueIndex++;
		return cmd;

	}
}
