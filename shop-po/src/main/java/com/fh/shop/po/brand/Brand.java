/** 
 * <pre>项目名称:shop-admin
 * 文件名称:Brand.java 
 * 包名:com.fh.shop.backend.po.brand 
 * 创建日期:2018年12月27日下午6:29:38 
 * Copyright (c) 2018, xxxxxx@163.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.po.brand;

import com.fh.shop.backend.po.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/** 
 * <pre>项目名称：shop-admin
 * 类名称：Brand    
 * 类描述：    
 * 创建人：lyb
 * 创建时间：2018年12月27日 下午6:29:38    
 * 修改人：lyb
 * 修改时间：2018年12月27日 下午6:29:38    
 * 修改备注：       
 * @version </pre>    
 */
public class Brand extends Page implements Serializable{

	private static final long serialVersionUID = 7051319223146789196L;
	
	private Integer id;
	
	private String brandName;
	
	private Date entryTime;
	
	private Date updateTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date minEntryTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date maxEntryTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date minUpdateTime;
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date maxUpdateTime;
	
	private String minEntryTimeStr;

	private String  maxEntryTimeStr;

	private String  minUpdateTimeStr;

	private String  maxUpdateTimeStr;

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Date getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getMinEntryTime() {
		return minEntryTime;
	}

	public void setMinEntryTime(Date minEntryTime) {
		this.minEntryTime = minEntryTime;
	}

	public Date getMaxEntryTime() {
		return maxEntryTime;
	}

	public void setMaxEntryTime(Date maxEntryTime) {
		this.maxEntryTime = maxEntryTime;
	}

	public Date getMinUpdateTime() {
		return minUpdateTime;
	}

	public void setMinUpdateTime(Date minUpdateTime) {
		this.minUpdateTime = minUpdateTime;
	}

	public Date getMaxUpdateTime() {
		return maxUpdateTime;
	}

	public void setMaxUpdateTime(Date maxUpdateTime) {
		this.maxUpdateTime = maxUpdateTime;
	}

	public String getMinEntryTimeStr() {
		return minEntryTimeStr;
	}

	public void setMinEntryTimeStr(String minEntryTimeStr) {
		this.minEntryTimeStr = minEntryTimeStr;
	}

	public String getMaxEntryTimeStr() {
		return maxEntryTimeStr;
	}

	public void setMaxEntryTimeStr(String maxEntryTimeStr) {
		this.maxEntryTimeStr = maxEntryTimeStr;
	}

	public String getMinUpdateTimeStr() {
		return minUpdateTimeStr;
	}

	public void setMinUpdateTimeStr(String minUpdateTimeStr) {
		this.minUpdateTimeStr = minUpdateTimeStr;
	}

	public String getMaxUpdateTimeStr() {
		return maxUpdateTimeStr;
	}

	public void setMaxUpdateTimeStr(String maxUpdateTimeStr) {
		this.maxUpdateTimeStr = maxUpdateTimeStr;
	}
	
}
