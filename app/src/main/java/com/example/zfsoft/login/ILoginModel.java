package com.example.zfsoft.login;

/**
 * 创建日期：2018/6/8 on 9:54
 * 描述:
 * 作者:Ls
 */
public interface ILoginModel {

   void login(String userName,String passWord,LoginListener loginListener);


       interface LoginListener{
       void loginSuccess(LoginInfo info);

       void loginFailed(String msg);
       }
}
