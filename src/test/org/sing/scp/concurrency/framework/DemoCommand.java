package test.org.sing.scp.concurrency.framework;

import org.junit.Assert;
import org.junit.Test;
import org.sing.sp.concurrency.framework.ConcurrencyCommandBase;
import org.sing.sp.concurrency.framework.IPersistenceCommand;
import org.sing.sp.concurrency.framework.processor.CommandProcessor;
import org.sing.sp.concurrency.framework.processor.CommandQueue;
import org.springframework.context.ApplicationContext;

public class DemoCommand extends ConcurrencyCommandBase implements
		IPersistenceCommand {
	private String nameString;

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public boolean verify() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean run() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void done() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(ApplicationContext context) {
		// TODO Auto-generated method stub

	}

	@Test
	public void test() {
		DemoCommand demoCommand = new DemoCommand();
		demoCommand.setNameString("aaaaaa");
		DemoCommand bb = demoCommand;

		DemoCommand aa = (DemoCommand) demoCommand.clone();
		Assert.assertNotEquals(bb, aa);
		Assert.assertEquals(false, aa == bb);

		System.out.println("aa>>" + aa.getNameString());
		System.out.println("bb>>" + bb.getNameString());
		aa.setNameString("bbbbbb");

		Assert.assertNotEquals(bb.getNameString(), aa.getNameString());
		System.out.println("aa>>" + aa.getNameString());
		System.out.println("bb>>" + bb.getNameString());

	}

	@Test
	public void testMain() {
		//new CommandProcessor().setQueue(new CommandQueue()).processing();
	}
}
