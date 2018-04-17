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
public class User extends BaseObject
{
	private static final long serialVersionUID = 1L;

	/**  */
	private java.lang.String id;

	/**  */
	private java.lang.String name;

	/**  */
	private java.lang.String phone;
	
	/** 保留字段 */
	private java.lang.String reserve;

	private java.lang.String reserve1;
	
	/** 用户标识：0 管理员 1 用户 */
	private Integer user_del;
	
	private java.lang.String link_push;
	
	private java.lang.String link_push_two;
	

	public void setId(java.lang.String id) {
		this.id = id;
	}
	
	public java.lang.String getId() {
		return this.id;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getName() {
		return this.name;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setUser_del(Integer user_del) {
		this.user_del = user_del;
	}
	
	public Integer getUser_del() {
		return this.user_del;
	}

	public java.lang.String getReserve() {
		return reserve;
	}

	public void setReserve(java.lang.String reserve) {
		this.reserve = reserve;
	}

	public java.lang.String getReserve1() {
		return reserve1;
	}

	public void setReserve1(java.lang.String reserve1) {
		this.reserve1 = reserve1;
	}

	public java.lang.String getLink_push() {
		return link_push;
	}

	public void setLink_push(java.lang.String link_push) {
		this.link_push = link_push;
	}

	public java.lang.String getLink_push_two() {
		return link_push_two;
	}

	public void setLink_push_two(java.lang.String link_push_two) {
		this.link_push_two = link_push_two;
	}

}