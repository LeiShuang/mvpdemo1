package com.example.zfsoft.login;

/**
 * 创建日期：2018/6/8 on 9:53
 * 描述:登录的用户信息实体
 * 作者:Ls
 */
public class LoginInfo {
    private String userName;
    private String passWord;

    public LoginInfo(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
