package com.winnerlook.kuailq.dao.impl;

import java.util.List;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.mybatis.MybatisBaseDao;
import com.winnerlook.kuailq.dao.IPhonesDao;
import com.winnerlook.kuailq.pojo.Phones;

/**
 * @说明 XXX Dao接口实现 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public class PhonesDaoImpl extends MybatisBaseDao<Phones> implements IPhonesDao
{
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
		return super.selectOne("selectById", id);
	}

	@Override
	public Phones selectByPhone(String phone) {
		return super.selectOne("selectByPhone", phone);
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
		return super.selectList("selectList", phones);
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
		return super.selectForPage("selectForPageCount", "selectForPage", page);
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
		return super.insert("insert", phones);
	}

	/**
	 * 批量插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param	phonesList		参数含义
	 */
	@Override
	public void batchInsert(List<Phones> phonesList)
	{
		super.insertObject("batchInsert", phonesList);
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
		return super.update("update", phones);
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
		return super.delete("delete", phones);
	}
	
	/**
	 * 根据主键ID删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id		主键ID
	 * @return	int		删除成功所影响的行数			
	 */
	@Override
	public int deleteById(java.lang.String id)
	{
		return super.deleteByParameter("deleteById", id);
	}

	
}