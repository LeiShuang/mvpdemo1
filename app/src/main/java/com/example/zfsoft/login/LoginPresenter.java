package com.example.zfsoft.login;

import android.os.Handler;

import com.example.zfsoft.base.BasePresenter;


/**
 * 创建日期：2018/6/8 on 9:54
 * 描述:
 * 作者:Ls
 */
public class LoginPresenter extends BasePresenter<LoginActivity> implements ILoginContract.ILoginPresenter{
    private ILoginContract.ILoginView mView;
    private ILoginModel mModel;
    private Handler mHandler = new Handler() ;
    public LoginPresenter(ILoginContract.ILoginView view){
        this.mView = view;
        mModel = new LoginModel();

    }
    @Override
    protected void initData() {
        mView.clearText();
    }

    @Override
    public void doLogin() {
        if (mView.getUserName().equals("") || mView.getUserPassword().equals("")){
            mView.showEmptyMsg();
            return;
        }
            mView.showLoading();
            mModel.login(mView.getUserName(), mView.getUserPassword(), new ILoginModel.LoginListener() {
                @Override
                public void loginSuccess(final LoginInfo info) {

                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            mView.hideLoading();
                            mView.showSucessMsg(info);
                            mView.toSecondActivity();
                        }
                    });

                }

                @Override
                public void loginFailed(final String msg) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                            mView.hideLoading();
                            mView.showFailMsg(msg);
                    }
                });
                }
            });
    }


}

