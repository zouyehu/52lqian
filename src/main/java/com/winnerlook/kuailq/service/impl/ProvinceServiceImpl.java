package com.winnerlook.kuailq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.datasource.DataSource;
import com.winnerlook.framework.datasource.DataSourceEnum;
import com.winnerlook.kuailq.dao.IProvinceDao;
import com.winnerlook.kuailq.pojo.Province;
import com.winnerlook.kuailq.service.IProvinceService;

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
public class ProvinceServiceImpl implements IProvinceService
{
	@Autowired
	private IProvinceDao provinceDao;

	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	Province		
	 */
	@Override
	public Province selectById(java.lang.Integer id)
	{
		return provinceDao.selectById(id);
	}

	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	province		参数含义
	 * @return	List<Province>		
	 */
	@Override
	public List<Province> selectList(Province province)
	{
		return provinceDao.selectList(province);
	}
	
	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<Province>		
	 */
	@Override
	public Page<Province> selectForPage(Page<Province> page)
	{
		return provinceDao.selectForPage(page);
	}

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	province		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	@Override
	public int insert(Province province)
	{
		return provinceDao.insert(province);
	}

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	province		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	@Override
	public int update(Province province)
	{
		return provinceDao.update(province);
	}

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	province		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	@Override
	public int delete(Province province)
	{
		return provinceDao.delete(province);
	}

}