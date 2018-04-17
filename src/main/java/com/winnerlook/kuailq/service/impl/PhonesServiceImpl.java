package com.winnerlook.kuailq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.datasource.DataSource;
import com.winnerlook.framework.datasource.DataSourceEnum;
import com.winnerlook.kuailq.dao.IPhonesDao;
import com.winnerlook.kuailq.pojo.Phones;
import com.winnerlook.kuailq.service.IPhonesService;

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
public class PhonesServiceImpl implements IPhonesService
{
	@Autowired
	private IPhonesDao phonesDao;

	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	Phones		
	 */
	@Override
	public Phones selectById(java.lang.String id)
	{
		return phonesDao.selectById(id);
	}

	@Override
	public Phones selectByPhone(String phone) {
		return phonesDao.selectByPhone(phone);
	}
	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	phones		参数含义
	 * @return	List<Phones>		
	 */
	@Override
	public List<Phones> selectList(Phones phones)
	{
		return phonesDao.selectList(phones);
	}
	
	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<Phones>		
	 */
	@Override
	public Page<Phones> selectForPage(Page<Phones> page)
	{
		return phonesDao.selectForPage(page);
	}

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	phones		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	@Override
	public int insert(Phones phones)
	{
		return phonesDao.insert(phones);
	}

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	phones		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	@Override
	public int update(Phones phones)
	{
		return phonesDao.update(phones);
	}

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	phones		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	@Override
	public int delete(Phones phones)
	{
		return phonesDao.delete(phones);
	}

	

}