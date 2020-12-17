package com.javalabs.config;

public class ConfigurationImpl implements Configuration {

	private String baseUrl;
	private String version;
	private String complementUrl;
	
	
	
	
	public void setVersion(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}


	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getBaseUrl() {
		return baseUrl;
	}

	public String getComplementUrl() {
		return complementUrl;
	}

	public void setComplementUrl(String complementUrl) {
		this.complementUrl = complementUrl;
		
	}

	

}
