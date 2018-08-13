package com.citi.portfoliomanager.entity;

import java.io.Serializable;

public class Users implements Serializable {
    private int id;
    private String name; //用户名
    private String pwd;  //密码
    private String usertype;//管理员还是普通用户，仅仅用作页面跳转

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}
