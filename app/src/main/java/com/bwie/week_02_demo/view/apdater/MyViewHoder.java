package com.bwie.week_02_demo.view.apdater;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.bwie.week_02_demo.R;
import com.facebook.drawee.view.SimpleDraweeView;

class MyViewHoder extends RecyclerView.ViewHolder {

    public SimpleDraweeView iv_image;
    public TextView tv_title;

    public MyViewHoder(View itemView) {
        super(itemView);

        tv_title = itemView.findViewById(R.id.tv_title);
        iv_image = itemView.findViewById(R.id.iv_image);
    }
}
