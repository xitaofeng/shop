package com.mission.shop.order.dao.model;

import java.io.Serializable;
import java.util.Date;

public class OrderHistoryStatus implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_history_status.id
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_history_status.order_id
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	private Long orderId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_history_status.status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	private Short status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_history_status.remark
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	private String remark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column order_history_status.create_time
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table order_history_status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_history_status.id
	 * @return  the value of order_history_status.id
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_history_status.id
	 * @param id  the value for order_history_status.id
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_history_status.order_id
	 * @return  the value of order_history_status.order_id
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_history_status.order_id
	 * @param orderId  the value for order_history_status.order_id
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_history_status.status
	 * @return  the value of order_history_status.status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_history_status.status
	 * @param status  the value for order_history_status.status
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public void setStatus(Short status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_history_status.remark
	 * @return  the value of order_history_status.remark
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_history_status.remark
	 * @param remark  the value for order_history_status.remark
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public void setRemark(String remark) {
		this.remark = remark == null ? null : remark.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column order_history_status.create_time
	 * @return  the value of order_history_status.create_time
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column order_history_status.create_time
	 * @param createTime  the value for order_history_status.create_time
	 * @mbggenerated  Wed Aug 06 21:14:03 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}