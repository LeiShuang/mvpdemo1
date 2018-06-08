package com.example.zfsoft.standardmvpdemo;

import com.example.zfsoft.base.ValueCallBack;

import java.util.List;

/**
 * 创建日期：2018/6/6 on 17:21
 * 描述:
 * 作者:Ls
 */
public interface IBuyBookModel {
    /**
     * 获取模拟数据
     * */
    void  getTestData(ValueCallBack<List<BuyBookBean>> callBack);

    /**
     * 返回本地adapter数据
     * @return
     */
    List<BuyBookBean> getAdapterData();
}
