package com.bwie.week_02_demo.view.apdater;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bwie.week_02_demo.R;
import com.bwie.week_02_demo.model.bean.Beans;
import com.bwie.week_02_demo.view.MainActivity;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHoder> {
    Context context;
    List<Beans.BooksBean> list;

    public MyAdapter(Context context, List<Beans.BooksBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         return new MyViewHoder(LayoutInflater.from(context).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
        //Uri parse = Uri.parse(list.get(position).getImage());
        holder.iv_image.setImageURI(list.get(position).getImage());
        holder.tv_title.setText(list.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
