package com.example.zfsoft.login;

import android.app.Activity;
import android.content.Context;

/**
 * 创建日期：2018/6/8 on 9:54
 * 描述:
 * 作者:Ls
 */
public interface ILoginContract  {

    interface ILoginView{

        String getUserName();
        String  getUserPassword();
        /**
         * 显示进度条
         * */
        void showLoading();
        void hideLoading();


        void showSucessMsg(LoginInfo info);
        void showFailMsg(String msg);

        void toSecondActivity();


        /**
         *
         * 清除账号密码
         * */
        void clearText();
        /**
         * 显示账号密码为空
         * */
        void showEmptyMsg();




    }
    interface ILoginPresenter{
       void doLogin();
    }
}
