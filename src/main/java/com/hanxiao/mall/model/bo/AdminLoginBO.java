package com.hanxiao.mall.model.bo;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/20
 **/

public class AdminLoginBO {
    private String email;
    private String pwd;

    @Override
    public String toString() {
        return "AdminLoginBO{" +
                "email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public AdminLoginBO() {
    }
}
