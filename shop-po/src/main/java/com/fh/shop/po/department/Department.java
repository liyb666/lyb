package com.fh.shop.po.department;

import java.io.Serializable;

public class Department implements Serializable {

    private static final long serialVersionUID = -3978839916613847207L;

    private Integer  id ;

    private String  name ;

    private Integer pId;

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }
}
