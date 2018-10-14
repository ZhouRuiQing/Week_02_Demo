package com.bwie.week_02_demo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.bwie.week_02_demo.R;
import com.bwie.week_02_demo.ibase.AccountConter;
import com.bwie.week_02_demo.model.bean.Beans;
import com.bwie.week_02_demo.present.AccountPresent;
import com.bwie.week_02_demo.view.apdater.MyAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AccountConter.View {

    private AccountPresent present;
    private RecyclerView recyLerView;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyLerView = findViewById(R.id.recylerView);
        present = new AccountPresent();
        present.attchView(this);
        present.ShowData();

    }

    @Override
    public void Showing(List<Beans.BooksBean> list) {

        Log.i("aaa",list+"");

        recyLerView.setLayoutManager(new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false));
        myAdapter = new MyAdapter(MainActivity.this, list);
        recyLerView.setAdapter(myAdapter);


    }

    @Override
    public void hideing() {

    }

    @Override
    public void onError() {

    }
}
