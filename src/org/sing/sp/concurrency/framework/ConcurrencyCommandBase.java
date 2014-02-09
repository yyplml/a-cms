package org.sing.sp.concurrency.framework;

public abstract class ConcurrencyCommandBase implements IConcurrencyCommand,
		Cloneable {


	@Override
	public boolean verify() {
		StateCounter.failed++;
		return true;
	}

	@Override
	public boolean run() {
		StateCounter.running++;
		// ...........

		StateCounter.running--;
		return true;
	}

	@Override
	public void done() {
		StateCounter.success++;

	}

	@Override
	public void cancel() {
		StateCounter.canel++;

	}

	public ConcurrencyCommandBase clone() {

		try {
			return (ConcurrencyCommandBase) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}
