package com.winnerlook.framework.datasource;

/**
 * 数据源枚举常量类
 * @author Hu
 * @date 2017-03-29
 *
 */

public enum DataSourceEnum {

	MASTER("master","winnerlook数据源"),
	WINNER("winner","winner数据源"),
	SEND("send","send数据源"),
	ORDER("order","订单数据源"),
	EVENT("event","活动数据源"),
	RESERVE("reserve","预留数据源");
	
	private DataSourceEnum(String key, String description){
		this.key = key;
		this.description = description;
	}
	
	/**
	 * 数据源对应的key
	 * (用于在Spring配置文件中指定数据源Map中的key使用)
	 */
	private String key;
	/**
	 * 描述
	 */
	private String description;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
