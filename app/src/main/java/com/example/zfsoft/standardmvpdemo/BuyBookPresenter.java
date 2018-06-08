package com.example.zfsoft.standardmvpdemo;

import com.example.zfsoft.base.BasePresenter;
import com.example.zfsoft.base.ValueCallBack;

import java.util.List;

/**
 * 创建日期：2018/6/6 on 17:19
 * 描述:
 * 作者:Ls
 */
public class BuyBookPresenter extends BasePresenter<BuyBookActivity> implements IBuyBookContract.IBuyBookPresenter {
    private IBuyBookContract.IBuyBookView mView;
    private IBuyBookModel mModel;

    public BuyBookPresenter(IBuyBookContract.IBuyBookView view) {
       this.mView = view;
       this.mModel = new BuyBookModel();
    }

    @Override
    protected void initData() {
        mModel.getTestData(new ValueCallBack<List<BuyBookBean>>() {
            @Override
            public void success(List<BuyBookBean> buyBookBeans) {
                //简单的数据操作就在presenter里面完成

                mModel.getAdapterData().addAll(buyBookBeans);

                mView.refreshAdapter();
            }

            @Override
            public void onFail(String code) {
                mView.showToast(code);

                mView.onEmpty();
            }
        });

    }

    @Override
    public List<BuyBookBean> getAdapterData() {
        return mModel.getAdapterData();
    }
}
