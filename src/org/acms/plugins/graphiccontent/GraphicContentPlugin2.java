package org.acms.plugins.graphiccontent;

import org.spframework.plugins.BasePlugin;
import org.springframework.stereotype.Service;

@Service("GraphicContentPlugin2")
public class GraphicContentPlugin2 extends BasePlugin {
	public GraphicContentPlugin2() {
		System.out.println("init graphic content plugin-->");

		super.setPluginName("Graphic Content 2");
		super.setPluginDescription("This's a Graphic Content plugin");
	}

	@Override
	public void install() {
		System.out.println("-------->>");
	}
}
