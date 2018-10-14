package com.bwie.week_02_demo.present;

import android.util.Log;

import com.bwie.week_02_demo.ibase.AccountConter;
import com.bwie.week_02_demo.model.bean.Beans;
import com.bwie.week_02_demo.model.models.AccountModel;
import com.bwie.week_02_demo.model.utils.Api;
import com.bwie.week_02_demo.model.utils.Cantans;

import java.util.List;

public class AccountPresent implements AccountConter.Present{

    private AccountModel model;
     private AccountConter.View view;

     AccountConter.Model.MvpCallBack callBack;
    public AccountPresent(){

        model=new AccountModel();
    }

    @Override
    public void ShowData() {

        model.ShowData(new AccountConter.Model.MvpCallBack() {
            @Override
            public void onSuccess(List<Beans.BooksBean> list) {

                view.Showing(list);
            }

            @Override
            public void onError(String msg) {

            }
        });
    }

    @Override
    public void attchView(AccountConter.View view) {

        this.view=view;
    }

    @Override
    public void deattchView() {

    }


}
