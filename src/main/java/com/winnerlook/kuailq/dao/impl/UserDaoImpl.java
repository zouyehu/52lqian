package com.winnerlook.kuailq.dao.impl;

import java.util.List;

import com.winnerlook.framework.base.Page;
import com.winnerlook.framework.mybatis.MybatisBaseDao;
import com.winnerlook.kuailq.dao.IUserDao;
import com.winnerlook.kuailq.pojo.User;

/**
 * @说明 XXX Dao接口实现 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public class UserDaoImpl extends MybatisBaseDao<User> implements IUserDao
{
	
	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	User		
	 */
	@Override
	public User selectById(java.lang.String id)
	{
		return super.selectOne("selectById", id);
	}

	//通过手机号查询，唯一性
	@Override
	public String selectByPhone(String phone) {
		return (String) super.selectOneByParameter("selectByPhone", phone);
	}
	
	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	user		参数含义
	 * @return	List<User>		
	 */
	@Override
	public List<User> selectList(User user)
	{
		return super.selectList("selectList", user);
	}
	
	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<User>		
	 */
	@Override
	public Page<User> selectForPage(Page<User> page)
	{
		return super.selectForPage("selectForPageCount", "selectForPage", page);
	}

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	user		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	@Override
	public int insert(User user)
	{
		return super.insert("insert", user);
	}

	/**
	 * 批量插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param	userList		参数含义
	 */
	@Override
	public void batchInsert(List<User> userList)
	{
		super.insertObject("batchInsert", userList);
	}

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	user		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	@Override
	public int update(User user)
	{
		return super.update("update", user);
	}

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	user		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	@Override
	public int delete(User user)
	{
		return super.delete("delete", user);
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