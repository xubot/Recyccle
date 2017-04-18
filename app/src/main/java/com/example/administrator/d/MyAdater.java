package com.example.administrator.d;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * 用途：
 * 作者：xuBoTao
 * 时间：2017/4/17 20:26
 */

class MyAdater extends RecyclerView.Adapter<MyAdater.MyRecyclerHolder>{
    private final Context context;
    private final List<Integer> integerList;
    private final List<Bean> beanList;

    public MyAdater(Context context, List<Integer> integerList, List<Bean> beanList) {
        this.context = context;
        this.integerList = integerList;
        this.beanList = beanList;
    }

    @Override
    public MyRecyclerHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        MyRecyclerHolder myRecyclerHolder = new MyRecyclerHolder(view);
        myRecyclerHolder.img= (ImageView) view.findViewById(R.id.img);
        myRecyclerHolder.rv= (RecyclerView) view.findViewById(R.id.rv_rv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        myRecyclerHolder.rv.setLayoutManager(linearLayoutManager);
        MyTweAdater myAdater = new MyTweAdater(context,beanList);
        myRecyclerHolder.rv.setAdapter(myAdater);
        return myRecyclerHolder;
    }

    @Override
    public void onBindViewHolder(MyRecyclerHolder holder, int position) {
        holder.img.setImageResource(integerList.get(position));
    }

    @Override
    public int getItemCount() {
        return integerList.size();
    }
    public static class MyRecyclerHolder extends RecyclerView.ViewHolder{
        public MyRecyclerHolder(View itemView) {
            super(itemView);
        }
        //设置得到控件
        ImageView img;
        RecyclerView rv;
    }
}
