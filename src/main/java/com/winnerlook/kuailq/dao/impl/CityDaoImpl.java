package com.winnerlook.kuailq.dao.impl;

import java.util.List;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.mybatis.MybatisBaseDao;
import com.winnerlook.kuailq.dao.ICityDao;
import com.winnerlook.kuailq.pojo.City;

/**
 * @说明 XXX Dao接口实现 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public class CityDaoImpl extends MybatisBaseDao<City> implements ICityDao
{
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
		return super.selectOne("selectById", id);
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
		return super.selectList("selectList", city);
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
		return super.selectForPage("selectForPageCount", "selectForPage", page);
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
		return super.insert("insert", city);
	}

	/**
	 * 批量插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param	cityList		参数含义
	 */
	@Override
	public void batchInsert(List<City> cityList)
	{
		super.insertObject("batchInsert", cityList);
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
		return super.update("update", city);
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
		return super.delete("delete", city);
	}
	
	/**
	 * 根据主键ID删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id		主键ID
	 * @return	int		删除成功所影响的行数			
	 */
	@Override
	public int deleteById(java.lang.Integer id)
	{
		return super.deleteByParameter("deleteById", id);
	}
}