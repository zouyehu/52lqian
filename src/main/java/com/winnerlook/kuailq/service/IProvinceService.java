package com.winnerlook.kuailq.service;

import java.util.List;

import com.winnerlook.framework.base.Page;
import com.winnerlook.kuailq.pojo.Province;

/**
 * @说明 XXX Service接口 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public interface IProvinceService 
{
	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	Province		
	 */
	Province selectById(java.lang.Integer id);

	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	province		参数含义
	 * @return	List<Province>		
	 */
	List<Province> selectList(Province province);

	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<Province>		
	 */
	Page<Province> selectForPage(Page<Province> page);

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	province		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	int insert(Province province);

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	province		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	int update(Province province);

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	province		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	int delete(Province province);
}