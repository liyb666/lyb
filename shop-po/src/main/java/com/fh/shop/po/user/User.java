/**
 * <pre>项目名称:shop-admin
 * 文件名称:User.java
 * 包名:com.fh.shop.backend.po.user
 * 创建日期:2019年1月7日下午3:59:23
 * Copyright (c) 2019, xxxxxx@163.com All Rights Reserved.</pre>
 */
package com.fh.shop.po.user;

import com.fh.shop.backend.po.Page;
import com.fh.shop.backend.po.department.Department;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <pre>项目名称：shop-admin
 * 类名称：User    
 * 类描述：    
 * 创建人：lyb
 * 创建时间：2019年1月7日 下午3:59:23    
 * 修改人：lyb
 * 修改时间：2019年1月7日 下午3:59:23    
 * 修改备注：       
 * @version </pre>    
 */
public class User extends Page implements Serializable {


    private static final long serialVersionUID = 1476620649439334911L;

    private Integer id;

    private String userName;

    private String password;

    private Integer sex;

    private Double salary;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private Department department;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date minBirthday;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date maxBirthday;

    private String minSalary;

    private String maxSalary;

    private String userRealName;

    private String imgCode;

    private String salt;

    private Date loginDate;

    private Integer loginTime;

    private Date lastLoginTime;

    private Integer status;

    private Date errorLoginDate;

    private Integer errorLoginTime;

    private String deptIdListStr;

    private String headerPath;

    private String oldHeaderPath;

    private List<Integer> deptIdList = new ArrayList<>();

    public String getOldHeaderPath() {
        return oldHeaderPath;
    }

    public void setOldHeaderPath(String oldHeaderPath) {
        this.oldHeaderPath = oldHeaderPath;
    }

    public String getHeaderPath() {
        return headerPath;
    }

    public void setHeaderPath(String headerPath) {
        this.headerPath = headerPath;
    }

    public List<Integer> getDeptIdList() {
        return deptIdList;
    }

    public void setDeptIdList(List<Integer> deptIdList) {
        this.deptIdList = deptIdList;
    }

    public String getDeptIdListStr() {
        return deptIdListStr;
    }

    public void setDeptIdListStr(String deptIdListStr) {
        this.deptIdListStr = deptIdListStr;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getErrorLoginDate() {
        return errorLoginDate;
    }

    public void setErrorLoginDate(Date errorLoginDate) {
        this.errorLoginDate = errorLoginDate;
    }

    public Integer getErrorLoginTime() {
        return errorLoginTime;
    }

    public void setErrorLoginTime(Integer errorLoginTime) {
        this.errorLoginTime = errorLoginTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    public String getSalt() {

        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getImgCode() {
        return imgCode;
    }

    public void setImgCode(String imgCode) {
        this.imgCode = imgCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getMinBirthday() {
        return minBirthday;
    }

    public void setMinBirthday(Date minBirthday) {
        this.minBirthday = minBirthday;
    }

    public Date getMaxBirthday() {
        return maxBirthday;
    }

    public void setMaxBirthday(Date maxBirthday) {
        this.maxBirthday = maxBirthday;
    }


    public String getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(String minSalary) {
        this.minSalary = minSalary;
    }

    public String getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(String maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }
}
