package com.winnerlook.framework.datasource;

/**
 * 动态数据源持有者
 * @author Hu
 * @date 2017-03-29
 *
 */

public class DynamicDataSourceHolder {

	private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
	
	/**
	 * 设置数据源对应的key
	 */
	public static void setDataSourceKey(String key){
		threadLocal.set(key);
	}
	/**
	 * 获取数据源对应的key
	 */
	public static String getDataSourceKey(){
		return threadLocal.get();
	}
}
