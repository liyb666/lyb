package com.fh.shop.po.area;

import java.io.Serializable;

public class AreaInfo implements Serializable {

    private static final long serialVersionUID = -805526691437719162L;

    private  Integer id;

    private  String cityName;

    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
