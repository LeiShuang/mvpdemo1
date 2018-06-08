package com.example.zfsoft.standardmvpdemo;

import android.os.Handler;

import com.example.zfsoft.base.ValueCallBack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 创建日期：2018/6/6 on 17:21
 * 描述:
 * 作者:Ls
 */
public class BuyBookModel implements IBuyBookModel {

    private List<BuyBookBean> listData;

    public BuyBookModel() {
        this.listData = new ArrayList<>();
    }

    @Override
    public void getTestData(final ValueCallBack<List<BuyBookBean>> callBack) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                List<BuyBookBean> list = new ArrayList<>();
                list.add(new BuyBookBean("赵云",1,"只是一个人"));
                list.add(new BuyBookBean("王小二",1,"这是一个傻子"));
                list.add(new BuyBookBean("赵三",2,"怕是一个大神"));
                list.add(new BuyBookBean("王麻子",200,"这是一个喜剧演员"));

                Random random = new Random();
                int  W = random.nextInt(10);
                if (W > 5){
                    callBack.success(list);
                }else {
                    callBack.onFail("请求失败");
                }
            }
        },1000);

    }

    @Override
    public List<BuyBookBean> getAdapterData() {
        return listData;
    }
}
