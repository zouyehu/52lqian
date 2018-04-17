package com.winnerlook.kuailq.dao.impl;

import java.util.List;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.mybatis.MybatisBaseDao;
import com.winnerlook.kuailq.dao.ILogninfoDao;
import com.winnerlook.kuailq.pojo.Logninfo;

/**
 * @说明 XXX Dao接口实现 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public class LogninfoDaoImpl extends MybatisBaseDao<Logninfo> implements ILogninfoDao
{
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
		return super.selectOne("selectById", id);
	}
	
	@Override
	public Logninfo selectByUserid(String userid) {
		return super.selectOne("selectByUserid", userid);
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
		return super.selectList("selectList", logninfo);
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
		return super.selectForPage("selectForPageCount", "selectForPage", page);
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
		return super.insert("insert", logninfo);
	}

	/**
	 * 批量插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param	logninfoList		参数含义
	 */
	@Override
	public void batchInsert(List<Logninfo> logninfoList)
	{
		super.insertObject("batchInsert", logninfoList);
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
		return super.update("update", logninfo);
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
		return super.delete("delete", logninfo);
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