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
public class City extends BaseObject
{
	private static final long serialVersionUID = 1L;

	/**  */
	private java.lang.Integer id;

	/**  */
	private java.lang.Integer city_index;

	/**  */
	private java.lang.Integer province_id;

	/**  */
	private java.lang.String name;

	public void setId(java.lang.Integer id) {
		this.id = id;
	}
	
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setCity_index(java.lang.Integer city_index) {
		this.city_index = city_index;
	}
	
	public java.lang.Integer getCity_index() {
		return this.city_index;
	}

	public void setProvince_id(java.lang.Integer province_id) {
		this.province_id = province_id;
	}
	
	public java.lang.Integer getProvince_id() {
		return this.province_id;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
	
	public java.lang.String getName() {
		return this.name;
	}

}