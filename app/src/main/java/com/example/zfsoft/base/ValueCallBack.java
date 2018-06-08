package com.example.zfsoft.base;

/**
 * 创建日期：2018/6/6 on 17:35
 * 描述:
 * 作者:Ls
 */
public interface ValueCallBack<T> {
    void success(T t);

    void onFail(String code);
}
