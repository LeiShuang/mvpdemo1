package com.example.zfsoft.standardmvpdemo;

/**
 * 创建日期：2018/6/6 on 17:25
 * 描述:
 * 作者:Ls
 */
public class BuyBookBean {
    private String name;
    private int num;
    private String time;

    public BuyBookBean(String name, int num, String time) {
        this.name = name;
        this.num = num;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "BuyBookBean{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", time='" + time + '\'' +
                '}';
    }
}
