package com.fh.shop.po.member;

import java.io.Serializable;

public class MemberInfo implements Serializable {

    private static final long serialVersionUID = -2716447828438778769L;

    private Integer id;

    private String userName;

    private String password;

    private String birthday;

    private String phone;

    private String email;

    private Integer shengId;

    private Integer shiId;

    private Integer xianId;

    private String minBirthday;

    private String maxBirthday;

    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getMinBirthday() {
        return minBirthday;
    }

    public void setMinBirthday(String minBirthday) {
        this.minBirthday = minBirthday;
    }

    public String getMaxBirthday() {
        return maxBirthday;
    }

    public void setMaxBirthday(String maxBirthday) {
        this.maxBirthday = maxBirthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getShengId() {
        return shengId;
    }

    public void setShengId(Integer shengId) {
        this.shengId = shengId;
    }

    public Integer getShiId() {
        return shiId;
    }

    public void setShiId(Integer shiId) {
        this.shiId = shiId;
    }

    public Integer getXianId() {
        return xianId;
    }

    public void setXianId(Integer xianId) {
        this.xianId = xianId;
    }
}
