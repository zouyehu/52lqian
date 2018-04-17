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
public class Phones extends BaseObject
{
	private static final long serialVersionUID = 1L;

	/**  */
	private java.lang.String id;

	/**  */
	private java.lang.String phone;

	/**  */
	private java.lang.Integer num;
	
	private java.util.Date update_date;

	public void setId(java.lang.String id) {
		this.id = id;
	}
	
	public java.lang.String getId() {
		return this.id;
	}

	public void setPhone(java.lang.String phone) {
		this.phone = phone;
	}
	
	public java.lang.String getPhone() {
		return this.phone;
	}

	public void setNum(java.lang.Integer num) {
		this.num = num;
	}
	
	public java.lang.Integer getNum() {
		return this.num;
	}

	public java.util.Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(java.util.Date update_date) {
		this.update_date = update_date;
	}

}