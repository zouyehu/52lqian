package com.winnerlook.framework.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 
 */
public class DynamicDataSource extends AbstractRoutingDataSource 
{
	@Override
	protected Object determineCurrentLookupKey() 
	{
		return DynamicDataSourceHolder.getDataSourceKey();
	}
}
