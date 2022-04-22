package com.hanxiao.mall.model.bo;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/22
 **/

public class AdminSearchBO {
    private String nickname;
    private String email;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AdminSearchBO(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }

    public AdminSearchBO() {
    }
}
