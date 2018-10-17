package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="word-config")
public class CollectionController {
	 
	String dev;
	String preamble;
	String dataSource;
	String environment;
	String userId;
	String password;
	CollectionProperty collectionProperty;
	
	@GetMapping("/n")
	public CollectionProperty showLuckyWord() {
		CollectionProperty collectionProperty = new CollectionProperty();
		collectionProperty.setDataSource(dataSource);
		collectionProperty.setEnvironment(environment);
		collectionProperty.setUserId(userId);
		collectionProperty.setPassword(password);
		return collectionProperty;
		//return preamble + ": " + luckyWord + "\n" + " DataSource :" + dataSource;
	}
   
	

	public String getPreamble() {
		return preamble;
	}

	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
