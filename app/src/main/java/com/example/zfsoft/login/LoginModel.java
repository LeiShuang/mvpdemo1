package com.example.zfsoft.login;

/**
 * 创建日期：2018/6/8 on 9:54
 * 描述:
 * 作者:Ls
 */
public class LoginModel implements ILoginModel {
    @Override
    public void login(final String userName, final String passWord, final LoginListener loginListener) {
        /**
         * 模拟子线程 ，实现登录操作
         * */

        new  Thread(){
            public  void run(){
                super.run();

                try {
                    Thread.sleep(3000);

                    if (userName.equals("leishuang") && passWord.equals("111")){
                        loginListener.loginSuccess(new LoginInfo(userName,passWord));

                    }else {
                        loginListener.loginFailed("账号或密码错误");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
