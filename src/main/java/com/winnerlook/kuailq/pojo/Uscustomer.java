package com.winnerlook.kuailq.pojo;

import com.winnerlook.framework.base.BaseObject;

/**
 * @说明 XXX POJO 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2016
 * @author Hu
 * @date 2016-10-02
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * Hu			2016-10-02			新增
 */ 
public class Uscustomer extends BaseObject
{
	private static final long serialVersionUID = 1L;

	/**  */
	private java.lang.String id;

	/**  */
	private java.lang.String login_account;

	/**  */
	private java.lang.String password;

	/**  */
	private java.lang.String phones;

	/** 用户类型：0 管理员  1 用户 */
	private Integer type;

	/** 版本号 */
	private java.lang.Integer version_num;

	public void setId(java.lang.String id) {
		this.id = id;
	}
	
	public java.lang.String getId() {
		return this.id;
	}

	public void setLogin_account(java.lang.String login_account) {
		this.login_account = login_account;
	}
	
	public java.lang.String getLogin_account() {
		return this.login_account;
	}

	public void setPassword(java.lang.String password) {
		this.password = password;
	}
	
	public java.lang.String getPassword() {
		return this.password;
	}

	public void setPhones(java.lang.String phones) {
		this.phones = phones;
	}
	
	public java.lang.String getPhones() {
		return this.phones;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getType() {
		return this.type;
	}

	public void setVersion_num(java.lang.Integer version_num) {
		this.version_num = version_num;
	}
	
	public java.lang.Integer getVersion_num() {
		return this.version_num;
	}

}