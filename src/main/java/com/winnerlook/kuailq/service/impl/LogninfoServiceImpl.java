package com.winnerlook.kuailq.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.datasource.DataSource;
import com.winnerlook.framework.datasource.DataSourceEnum;
import com.winnerlook.kuailq.dao.ILogninfoDao;
import com.winnerlook.kuailq.pojo.Logninfo;
import com.winnerlook.kuailq.service.ILogninfoService;

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
public class LogninfoServiceImpl implements ILogninfoService
{
	@Autowired
	private ILogninfoDao logninfoDao;

	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	Logninfo		
	 */
	@Override
	public Logninfo selectById(java.lang.String id)
	{
		return logninfoDao.selectById(id);
	}
	
	@Override
	public Logninfo selectByUserid(String userid) {
		return logninfoDao.selectByUserid(userid);
	}

	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	logninfo		参数含义
	 * @return	List<Logninfo>		
	 */
	@Override
	public List<Logninfo> selectList(Logninfo logninfo)
	{
		return logninfoDao.selectList(logninfo);
	}
	
	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<Logninfo>		
	 */
	@Override
	public Page<Logninfo> selectForPage(Page<Logninfo> page)
	{
		return logninfoDao.selectForPage(page);
	}

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	logninfo		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	@Override
	public int insert(Logninfo logninfo)
	{
		return logninfoDao.insert(logninfo);
	}

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	logninfo		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	@Override
	public int update(Logninfo logninfo)
	{
		return logninfoDao.update(logninfo);
	}

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	logninfo		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	@Override
	public int delete(Logninfo logninfo)
	{
		return logninfoDao.delete(logninfo);
	}

	

}