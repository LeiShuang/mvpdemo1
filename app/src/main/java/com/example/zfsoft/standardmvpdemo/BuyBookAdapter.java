package com.example.zfsoft.standardmvpdemo;

import android.content.Context;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * 创建日期：2018/6/6 on 17:21
 * 描述:
 * 作者:Ls
 */
public class BuyBookAdapter extends BaseAdapter {
    private List<BuyBookBean> mListData;
    private Context mContext;

    public BuyBookAdapter(List<BuyBookBean> listData, Context context) {
        mListData = listData;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mListData.size() == 0 ? 0 : mListData.size();
    }

    @Override
    public Object getItem(int position) {
        return mListData == null ? null : mListData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       MyViewHolder holder = null;
       if (convertView == null){
           convertView = View.inflate(mContext,R.layout.item_list,null);
           holder = new MyViewHolder(convertView);
           convertView.setTag(holder);
       }else {
           holder = (MyViewHolder) convertView.getTag();

       }
       holder.name.setText(mListData.get(position).getName());
       holder.number.setText(String.valueOf(mListData.get(position).getNum()));
       holder.time.setText(mListData.get(position).getTime());
       return  convertView;
    }

    class MyViewHolder{
        TextView name;
        TextView number;
        TextView time;

        public MyViewHolder(View convertView){
            name = (TextView) convertView.findViewById(R.id.name);
            number = (TextView) convertView.findViewById(R.id.number);
            time = (TextView) convertView.findViewById(R.id.time);
        }
    }
}
