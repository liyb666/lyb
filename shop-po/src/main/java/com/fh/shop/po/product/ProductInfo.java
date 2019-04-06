/** 
 * <pre>项目名称:shop-admin
 * 文件名称:ProductInfo.java 
 * 包名:com.fh.shop.backend.po.product 
 * 创建日期:2018年12月23日下午7:13:39 
 * Copyright (c) 2018, xxxxxx@163.com All Rights Reserved.</pre> 
 */  
package com.fh.shop.po.product;

import com.fh.shop.backend.po.Page;
import com.fh.shop.backend.po.brand.Brand;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/** 
 * <pre>项目名称：shop-admin
 * 类名称：ProductInfo    
 * 类描述：    
 * 创建人：lyb
 * 创建时间：2018年12月23日 下午7:13:39    
 * 修改人：lyb
 * 修改时间：2018年12月23日 下午7:13:39    
 * 修改备注：       
 * @version </pre>    
 */
public class ProductInfo extends Page implements Serializable {

	private static final long serialVersionUID = -5491449936350432370L;
	
	private Integer id;
	
	private String name;
	
	private Float price;
	
	private Date entryTime;
	
	private String entryTimeStr;
	
	private Date updateTime;
	
	private String updateTimeStr;
	
	private Brand brand = new Brand();
	
	private Float minPrice;
	
	private Float maxPrice;

	private String productImgPath;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date minEntryTime;
	
	private String minEntryTimeStr;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date maxEntryTime;
	
	private String  maxEntryTimeStr;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date minUpdateTime;
	
	private String  minUpdateTimeStr;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date maxUpdateTime;
	
	private String  maxUpdateTimeStr;

	private String  childImgPath;

	private String  mainImgPath;

	public String getChildImgPath() {
		return childImgPath;
	}

	public void setChildImgPath(String childImgPath) {
		this.childImgPath = childImgPath;
	}

	public String getMainImgPath() {
		return mainImgPath;
	}

	public void setMainImgPath(String mainImgPath) {
		this.mainImgPath = mainImgPath;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Float getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Float minPrice) {
		this.minPrice = minPrice;
	}

	public Float getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Float maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Date getMinEntryTime() {
		return minEntryTime;
	}

	public void setMinEntryTime(Date minEntryTime) {
		this.minEntryTime = minEntryTime;
	}

	public String getMinEntryTimeStr() {
		return minEntryTimeStr;
	}

	public void setMinEntryTimeStr(String minEntryTimeStr) {
		this.minEntryTimeStr = minEntryTimeStr;
	}

	public Date getMaxEntryTime() {
		return maxEntryTime;
	}

	public void setMaxEntryTime(Date maxEntryTime) {
		this.maxEntryTime = maxEntryTime;
	}

	public String getMaxEntryTimeStr() {
		return maxEntryTimeStr;
	}

	public void setMaxEntryTimeStr(String maxEntryTimeStr) {
		this.maxEntryTimeStr = maxEntryTimeStr;
	}

	public Date getMinUpdateTime() {
		return minUpdateTime;
	}

	public void setMinUpdateTime(Date minUpdateTime) {
		this.minUpdateTime = minUpdateTime;
	}

	public String getMinUpdateTimeStr() {
		return minUpdateTimeStr;
	}

	public void setMinUpdateTimeStr(String minUpdateTimeStr) {
		this.minUpdateTimeStr = minUpdateTimeStr;
	}

	public Date getMaxUpdateTime() {
		return maxUpdateTime;
	}

	public void setMaxUpdateTime(Date maxUpdateTime) {
		this.maxUpdateTime = maxUpdateTime;
	}

	public String getMaxUpdateTimeStr() {
		return maxUpdateTimeStr;
	}

	public void setMaxUpdateTimeStr(String maxUpdateTimeStr) {
		this.maxUpdateTimeStr = maxUpdateTimeStr;
	}

	public String getEntryTimeStr() {
		return entryTimeStr;
	}

	public void setEntryTimeStr(String entryTimeStr) {
		this.entryTimeStr = entryTimeStr;
	}

	public String getUpdateTimeStr() {
		return updateTimeStr;
	}

	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}

	public String getProductImgPath() {
		return productImgPath;
	}

	public void setProductImgPath(String productImgPath) {
		this.productImgPath = productImgPath;
	}
}
