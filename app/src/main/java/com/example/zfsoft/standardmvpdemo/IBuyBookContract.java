package com.example.zfsoft.standardmvpdemo;

import java.util.List;

/**
 * 创建日期：2018/6/6 on 17:22
 * 描述:界面和逻辑实现接口
 * 作者:Ls
 */
public interface IBuyBookContract {
    interface IBuyBookView{
        /**
         * @param mag toast信息
         *
         * */
        void showToast(String mag);
        /**
         * 刷新adapter
         * **/
        void refreshAdapter();

        void onEmpty();
    }

    interface IBuyBookPresenter{
        List<BuyBookBean> getAdapterData();
    }
}
