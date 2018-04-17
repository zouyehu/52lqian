package com.winnerlook.framework.pagination;

import com.winnerlook.framework.base.Page;

/**
 * 数据库方言基类：MySQL Oracle
 */
public abstract class Dialect {
	
	public static enum DialectType {
		
		MYSQL(MySQLDialect.class), 
		ORACLE(OracleDialect.class);

		DialectType(Class<? extends Dialect> clazz) {
			this.clazz = clazz;
		}

		/** 方言实现类字节码 */
		private Class<? extends Dialect> clazz;

		public Class<? extends Dialect> getClazz() {
			return clazz;
		}

		public void setClazz(Class<? extends Dialect> clazz) {
			this.clazz = clazz;
		}
	}

	/**
	 * 构造分页SQL
	 */
	public abstract String constructPageSql(String sql, Page<?> page);
}