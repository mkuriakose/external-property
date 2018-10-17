package com.example.demo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CollectionProperty {
	String luckyWord;
	String dev;
	String preamble;
	String dataSource;
	String environment;
	String userId;
	String password;
	
	
	
	public String getDev() {
		return dev;
	}
	public void setDev(String dev) {
		this.dev = dev;
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
	public String getLuckyWord() {
		return luckyWord;
	}
	public void setLuckyWord(String luckyWord) {
		this.luckyWord = luckyWord;
	}
	public String getPreamble() {
		return preamble;
	}
	public void setPreamble(String preamble) {
		this.preamble = preamble;
	}
	
	

}
