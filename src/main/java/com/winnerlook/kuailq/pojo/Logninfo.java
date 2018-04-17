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
public class Logninfo extends BaseObject
{
	private static final long serialVersionUID = 1L;

	/**  */
	private java.lang.String id;

	/**  */
	private java.lang.String userid;

	/** 期望贷款 */
	private java.lang.Integer qwlogn;

	/**  */
	private java.util.Date birthdate;

	/**  */
	private Integer gender;

	/** 户籍 */
	private Integer register;

	/**  */
	private java.lang.String house;

	/**  */
	private java.lang.String car;

	/** 职业 */
	private java.lang.String profession;

	/** 有无信用卡 */
	private java.lang.String policy;

	/** 微米贷 */
	private Integer wmd;

	/** 省份ID */
	private java.lang.Integer provice_id;

	/**  */
	private java.lang.String city;

	/** 发工资形式 */
	private java.lang.String pay_off;

	/** 月收入（元） */
	private java.lang.Integer m_income;

	/** 社保公积金 */
	private java.lang.String social;

	/** 工作时间 */
	private java.lang.String w_time;
	
	/**营业执照*/
	private java.lang.String business;

	public void setId(java.lang.String id) {
		this.id = id;
	}
	
	public java.lang.String getId() {
		return this.id;
	}

	public void setUserid(java.lang.String userid) {
		this.userid = userid;
	}
	
	public java.lang.String getUserid() {
		return this.userid;
	}

	public void setQwlogn(java.lang.Integer qwlogn) {
		this.qwlogn = qwlogn;
	}
	
	public java.lang.Integer getQwlogn() {
		return this.qwlogn;
	}

	public void setBirthdate(java.util.Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public java.util.Date getBirthdate() {
		return this.birthdate;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
	
	public Integer getGender() {
		return this.gender;
	}

	public void setRegister(Integer register) {
		this.register = register;
	}
	
	public Integer getRegister() {
		return this.register;
	}

	public void setHouse(java.lang.String house) {
		this.house = house;
	}
	
	public java.lang.String getHouse() {
		return this.house;
	}

	public void setCar(java.lang.String car) {
		this.car = car;
	}
	
	public java.lang.String getCar() {
		return this.car;
	}

	public void setProfession(java.lang.String profession) {
		this.profession = profession;
	}
	
	public java.lang.String getProfession() {
		return this.profession;
	}

	public void setPolicy(java.lang.String policy) {
		this.policy = policy;
	}
	
	public java.lang.String getPolicy() {
		return this.policy;
	}

	public void setWmd(Integer wmd) {
		this.wmd = wmd;
	}
	
	public Integer getWmd() {
		return this.wmd;
	}

	public void setProvice_id(java.lang.Integer provice_id) {
		this.provice_id = provice_id;
	}
	
	public java.lang.Integer getProvice_id() {
		return this.provice_id;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}
	
	public java.lang.String getCity() {
		return this.city;
	}

	public void setPay_off(java.lang.String pay_off) {
		this.pay_off = pay_off;
	}
	
	public java.lang.String getPay_off() {
		return this.pay_off;
	}

	public void setM_income(java.lang.Integer m_income) {
		this.m_income = m_income;
	}
	
	public java.lang.Integer getM_income() {
		return this.m_income;
	}

	public void setSocial(java.lang.String social) {
		this.social = social;
	}
	
	public java.lang.String getSocial() {
		return this.social;
	}

	public void setW_time(java.lang.String w_time) {
		this.w_time = w_time;
	}
	
	public java.lang.String getW_time() {
		return this.w_time;
	}

	public java.lang.String getBusiness() {
		return business;
	}

	public void setBusiness(java.lang.String business) {
		this.business = business;
	}

}