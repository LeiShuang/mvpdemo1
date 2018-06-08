package com.example.zfsoft.standardmvpdemo;

import android.widget.ListView;
import android.widget.Toast;

import com.example.zfsoft.base.BaseActivity;

/**
 * 创建日期：2018/6/6 on 17:19
 * 描述:
 * 作者:Ls
 */
public class BuyBookActivity extends BaseActivity<BuyBookPresenter> implements IBuyBookContract.IBuyBookView {
    private ListView mListView;
    private BuyBookAdapter mBuyBookAdapter;
    @Override
    protected void onPrepare() {
        mBuyBookAdapter = new BuyBookAdapter(basePresenter.getAdapterData(),this);
        mListView.setAdapter(mBuyBookAdapter);
        basePresenter.initData();
    }

    @Override
    protected BuyBookPresenter initPresenter() {
        return new BuyBookPresenter(this);
    }

    @Override
    protected void initView() {
        mListView = (ListView)findViewById(R.id.lv_listView);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void showToast(String mag) {
        Toast.makeText(this, mag, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void refreshAdapter() {
        mBuyBookAdapter.notifyDataSetChanged();
    }

    @Override
    public void onEmpty() {
        mListView.setEmptyView(null);
    }
}
