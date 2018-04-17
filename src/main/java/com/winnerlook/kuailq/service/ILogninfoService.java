package com.winnerlook.kuailq.service;

import java.util.List;

import com.winnerlook.framework.base.Page;
import com.winnerlook.kuailq.pojo.Logninfo;

/**
 * @说明 XXX Service接口 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public interface ILogninfoService 
{
	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	Logninfo		
	 */
	Logninfo selectById(java.lang.String id);
	Logninfo selectByUserid(String userid);
	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	logninfo		参数含义
	 * @return	List<Logninfo>		
	 */
	List<Logninfo> selectList(Logninfo logninfo);

	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<Logninfo>		
	 */
	Page<Logninfo> selectForPage(Page<Logninfo> page);

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	logninfo		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	int insert(Logninfo logninfo);

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	logninfo		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	int update(Logninfo logninfo);

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	logninfo		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	int delete(Logninfo logninfo);
}