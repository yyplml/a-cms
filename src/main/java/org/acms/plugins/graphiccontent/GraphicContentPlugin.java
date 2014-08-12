package org.acms.plugins.graphiccontent;

import org.spframework.plugins.BasePlugin;
import org.springframework.stereotype.Service;

@Service("GraphicContentPlugin")
public class GraphicContentPlugin extends BasePlugin {
	public GraphicContentPlugin() {
		System.out.println("init graphic content plugin-->");

		super.setPluginName("Graphic Content");
		super.setPluginDescription("This's a Graphic Content plugin");
	}

	@Override
	public void install() {
		System.out.println("-------->>");
	}
}
