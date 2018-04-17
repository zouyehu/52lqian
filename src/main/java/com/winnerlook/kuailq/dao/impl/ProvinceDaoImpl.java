package com.winnerlook.kuailq.dao.impl;

import java.util.List;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.mybatis.MybatisBaseDao;
import com.winnerlook.kuailq.dao.IProvinceDao;
import com.winnerlook.kuailq.pojo.Province;

/**
 * @说明 XXX Dao接口实现 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public class ProvinceDaoImpl extends MybatisBaseDao<Province> implements IProvinceDao
{
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
		return super.selectOne("selectById", id);
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
		return super.selectList("selectList", province);
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
		return super.selectForPage("selectForPageCount", "selectForPage", page);
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
		return super.insert("insert", province);
	}

	/**
	 * 批量插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param	provinceList		参数含义
	 */
	@Override
	public void batchInsert(List<Province> provinceList)
	{
		super.insertObject("batchInsert", provinceList);
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
		return super.update("update", province);
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
		return super.delete("delete", province);
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