package org.spframework.plugins.protecttheword;

import org.spframework.plugins.BasePlugin;
import org.springframework.stereotype.Service;

@Service("ProtectTheWordPlugin")
public class ProtectTheWordPlugin extends BasePlugin {

	public ProtectTheWordPlugin() {
		System.out.println("init ProtectTheWordController-->");
		super.setPluginName("protect the word");
	}

	@Override
	public void install() {
		// TODO Auto-generated method stub
		System.out.println("install ProtectTheWordPlugin");
	}

}
