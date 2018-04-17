package com.winnerlook.kuailq.dao;

import java.util.List;

import com.winnerlook.framework.base.Page;
import com.winnerlook.kuailq.pojo.User;

/**
 * @说明 XXX Dao接口 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public interface IUserDao 
{
	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	User		
	 */
	User selectById(java.lang.String id);
	
	//新增通过手机号查询用户信息
	String selectByPhone(String phone);

	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	user		参数含义
	 * @return	List<User>		
	 */
	List<User> selectList(User user);

	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<User>		
	 */
	Page<User> selectForPage(Page<User> page);

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	user		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	int insert(User user);

	/**
	 * 批量插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param	userList		参数含义
	 */
	void batchInsert(List<User> userList);

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	user		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	int update(User user);

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	user		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	int delete(User user);

	/**
	 * 根据主键ID删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id		主键ID
	 * @return	int		删除成功所影响的行数			
	 */
	int deleteById(java.lang.String id);
}