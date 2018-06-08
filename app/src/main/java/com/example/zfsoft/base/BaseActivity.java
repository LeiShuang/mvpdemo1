package com.example.zfsoft.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * 创建日期：2018/6/6 on 17:18
 * 描述:
 * 作者:Ls
 */
public abstract class BaseActivity<T  extends BasePresenter>extends Activity {
    protected T basePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());

        initView();

        basePresenter = initPresenter();

        onPrepare();
    }

    protected abstract void onPrepare();

    protected abstract T initPresenter();

    protected abstract void initView();

    protected abstract int getLayout();

}
