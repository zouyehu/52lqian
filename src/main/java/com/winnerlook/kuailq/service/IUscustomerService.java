package com.winnerlook.kuailq.service;

import com.winnerlook.kuailq.pojo.Uscustomer;

import java.util.List;
import java.util.Map;

import com.winnerlook.framework.base.Page;

/**
 * @说明 XXX Service接口 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public interface IUscustomerService 
{
	/**
	 * 根据主键ID查询
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	id    主键ID	
	 * @return	Uscustomer		
	 */
	Uscustomer selectById(java.lang.String id);

	/**
	 * 查询列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	uscustomer		参数含义
	 * @return	List<Uscustomer>		
	 */
	List<Uscustomer> selectList(Uscustomer uscustomer);

	/**
	 * 查询分页列表
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	page    	分页对象
	 * @return	Page<Uscustomer>		
	 */
	Page<Uscustomer> selectForPage(Page<Uscustomer> page);

	/**
	 * 插入
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	uscustomer		参数含义
	 * @return	int    		插入成功所影响的行数			
	 */
	int insert(Uscustomer uscustomer);

	/**
	 * 更新
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	uscustomer		参数含义
	 * @return	int    		更新成功所影响的行数			
	 */
	int update(Uscustomer uscustomer);

	/**
	 * 删除
	 * @author Hu 
	 * @date 2016-10-02
	 * @param 	uscustomer		参数含义
	 * @return	int    		删除成功所影响的行数			
	 */
	int delete(Uscustomer uscustomer);
	
	/**
	 * 
	 * @说明：用户登录
	 * @Auther Hu
	 * @date 2017年4月25日 下午5:44:00
	 * @param  username 用户名
	 * @param  password 密码
	 * @return UsUser   用户信息
	 */
	Map<String, Object> doLogin(java.lang.String username, java.lang.String passwd);
	
	/**
	 * 根据登录代码查询
	 * @author ligang 
	 * @date 2016-03-24
	 * @param 	loginAccount    登录代码	
	 * @return	UsUser		
	 */
	Uscustomer selectByLoginAccount(java.lang.String login_account);
}