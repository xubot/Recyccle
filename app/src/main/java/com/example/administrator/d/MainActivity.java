package com.example.administrator.d;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    List<Integer> integerList=new ArrayList<>();
    List<Bean> beanList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.mv);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        MyAdapter myAdater = new MyAdapter();
        recyclerView.setAdapter(myAdater);
    }
    public void init()
    {
        for(int i=0;i<5;i++)
        {
            integerList.add(R.mipmap.ic_launcher);
            beanList.add(new Bean(R.mipmap.ic_launcher,i+""));
         }
    }
    public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHoler> {
        @Override
        public MyViewHoler onCreateViewHolder(ViewGroup parent, int viewType) {
            MyViewHoler holer = new MyViewHoler(LayoutInflater.from(MainActivity.this).inflate(R.layout.item, parent, false));
            return holer;
        }
        @Override
        public void onBindViewHolder(MyViewHoler holder, int position) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
            linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
            holder.recy.setLayoutManager(linearLayoutManager);
            MyTweAdater buju = new MyTweAdater(MainActivity.this,beanList);
            holder.recy.setAdapter(buju);
            holder.pic.setImageResource(integerList.get(position));
        }
        @Override
        public int getItemCount() {
            return integerList.size();
        }

        public class MyViewHoler extends RecyclerView.ViewHolder {
            ImageView pic;
            RecyclerView recy;
            public MyViewHoler(View itemView) {
                super(itemView);
                pic = (ImageView) itemView.findViewById(R.id.image);
                recy = (RecyclerView) itemView.findViewById(R.id.rv_rv);
            }
        }
    }
}

