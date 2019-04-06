package com.fh.shop.po.log;


import com.fh.shop.backend.po.Page;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


public class Log extends Page implements Serializable{

	private static final long serialVersionUID = 5625341827161506838L;

	private Long id;
	
	private String userName;
	
	private String info;
	
	private Integer status;
	
	private Long useTime;
	
	private Date createDate;

	private String content;

	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date minCreateDate;

	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date maxCreateDate;

	private Long minUseTime;

	private Long maxUseTime;


	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getUseTime() {
		return useTime;
	}

	public void setUseTime(Long useTime) {
		this.useTime = useTime;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getMinCreateDate() {
		return minCreateDate;
	}

	public void setMinCreateDate(Date minCreateDate) {
		this.minCreateDate = minCreateDate;
	}

	public Date getMaxCreateDate() {
		return maxCreateDate;
	}

	public void setMaxCreateDate(Date maxCreateDate) {
		this.maxCreateDate = maxCreateDate;
	}

	public Long getMinUseTime() {
		return minUseTime;
	}

	public void setMinUseTime(Long minUseTime) {
		this.minUseTime = minUseTime;
	}

	public Long getMaxUseTime() {
		return maxUseTime;
	}

	public void setMaxUseTime(Long maxUseTime) {
		this.maxUseTime = maxUseTime;
	}
}
