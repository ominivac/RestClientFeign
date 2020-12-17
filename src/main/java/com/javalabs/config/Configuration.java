package com.javalabs.config;

import feign.Feign;

/*
 * Nao é extremanente necessária, so pra flexibilizar caso tenha muitos endpoints ,
 * o param de conexao pode ser passado direto pro Feign.builder()
 * 
 */
public interface Configuration {
	
	
	void setBaseUrl(String baseUrl);
	
	String getBaseUrl();
	
	void setVersion(String version);
	
	String getVersion();
	
	void setComplementUrl(String complementUrl);
	
	String getComplementUrl();
	
	

}
