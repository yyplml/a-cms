package org.spframework.plugins;

public class BasePlugin implements IPlugin {

	private String pluginName;
	private String pluginDescription;
	private boolean enable = false;
	private String version = "1.0";
	private String author = "Sing";

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public String getPluginName() {
		return pluginName;
	}

	public void setPluginName(String pluginName) {
		this.pluginName = pluginName;
	}

	public String getPluginDescription() {
		return pluginDescription;
	}

	public void setPluginDescription(String pluginDescription) {
		this.pluginDescription = pluginDescription;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public void install() {
		enable = true;
	}

	@Override
	public void uninstall() {
		enable = false;
	}

}
