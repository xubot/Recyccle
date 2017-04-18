package com.example.administrator.d;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/4/17 20:33
 */

class MyTweAdater extends RecyclerView.Adapter<MyTweAdater.MyRecyclerHolder>{
    private Context context;
    private List<Bean> list;

    public MyTweAdater(Context context, List<Bean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyRecyclerHolder holder=new MyRecyclerHolder(LayoutInflater.from(context).inflate(R.layout.item_twe,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerHolder holder, int position) {
        holder.ima.setImageResource(list.get(position).getImg());
        holder.tv.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyRecyclerHolder extends RecyclerView.ViewHolder {

        TextView tv;
        ImageView ima;

        public MyRecyclerHolder(View itemView) {
            super(itemView);
            ima = (ImageView) itemView.findViewById(R.id.img);
            tv = (TextView) itemView.findViewById(R.id.tv);

        }
    }
}
