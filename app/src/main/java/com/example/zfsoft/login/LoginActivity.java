package com.example.zfsoft.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zfsoft.base.BaseActivity;
import com.example.zfsoft.standardmvpdemo.BuyBookActivity;
import com.example.zfsoft.standardmvpdemo.R;

/**
 * 创建日期：2018/6/8 on 9:53
 * 描述:
 * 作者:Ls
 */
public class LoginActivity extends BaseActivity<LoginPresenter> implements ILoginContract.ILoginView, View.OnClickListener {

    private EditText mEt_user;
    private EditText mEt_pwd;
    private Button mBtn_login;
    private TextView mTv_sign;
    private ProgressBar mPb;

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void onPrepare() {

    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected void initView() {
        mEt_user = findViewById(R.id.et_mobile);
        mEt_pwd = findViewById(R.id.et_password);
        mBtn_login = findViewById(R.id.btn_login);
        mTv_sign = findViewById(R.id.forget_password);


        mBtn_login.setOnClickListener(this);
        mTv_sign.setOnClickListener(this);
    }

    @Override
    public String getUserName() {
        return mEt_user.getText().toString().trim();
    }

    @Override
    public String getUserPassword() {
        return mEt_pwd.getText().toString().trim();
    }

    @Override
    public void showLoading() {
        mPb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        mPb.setVisibility(View.GONE);
    }

    @Override
    public void showSucessMsg(LoginInfo info) {
        Toast.makeText(this, "账号是:"+ info.getUserName() + ",密码是：" + info.getPassWord(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailMsg(String msg) {
        Toast.makeText(this, "" + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void toSecondActivity() {
        this.startActivity(new Intent(this, BuyBookActivity.class));
    }

    @Override
    public void clearText() {
        mEt_pwd.setText("");
    }

    @Override
    public void showEmptyMsg() {
        Toast.makeText(this, "当前账号或者密码为空", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_login){
            basePresenter.doLogin();
        }else if (v.getId() == R.id.forget_password){
            basePresenter.initData();
        }
    }
}
