package org.acms.admin.webapi;

import java.util.List;

import org.spframework.PluginLoader;
import org.spframework.plugins.IPlugin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("admin/plugin")
public class PluginsController {

	@RequestMapping("/list")
	@ResponseBody
	public List<IPlugin> list() {
		 PluginLoader.Singleton();
//		List<IPlugin> plugins = PluginLoader.Singleton()
//				.getPluginConfiguration().getPlugin();
//
//		System.out.println("plugins count" + plugins.size());
		return null;
	}

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "testing";
	}
}
