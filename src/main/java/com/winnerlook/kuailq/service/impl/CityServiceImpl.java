package com.winnerlook.kuailq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.datasource.DataSource;
import com.winnerlook.framework.datasource.DataSourceEnum;
import com.winnerlook.kuailq.dao.ICityDao;
import com.winnerlook.kuailq.pojo.City;
import com.winnerlook.kuailq.service.ICityService;

/**
 * @说明 XXX Service接口实现
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */
@Service
@DataSource(DataSourceEnum.MASTER)
public class CityServiceImpl implements ICityService
{
	@Autowired
	private ICityDao cityDao;

	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	City		
	 */
	@Override
	public City selectById(java.lang.Integer id)
	{
		return cityDao.selectById(id);
	}

	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	city		参数含义
	 * @return	List<City>		
	 */
	@Override
	public List<City> selectList(City city)
	{
		return cityDao.selectList(city);
	}
	
	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<City>		
	 */
	@Override
	public Page<City> selectForPage(Page<City> page)
	{
		return cityDao.selectForPage(page);
	}

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	city		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	@Override
	public int insert(City city)
	{
		return cityDao.insert(city);
	}

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	city		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	@Override
	public int update(City city)
	{
		return cityDao.update(city);
	}

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	city		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	@Override
	public int delete(City city)
	{
		return cityDao.delete(city);
	}

}