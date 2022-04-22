package com.hanxiao.mall.model.vo;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/22
 **/

public class AdminLoginVO {
    private String token;
    private String name;

    @Override
    public String toString() {
        return "AdminLoginVO{" +
                "token='" + token + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdminLoginVO(String token, String name) {
        this.token = token;
        this.name = name;
    }

    public AdminLoginVO() {
    }
}
