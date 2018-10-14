package com.bwie.week_02_demo.model.models;

import android.util.Log;

import com.bwie.week_02_demo.ibase.AccountConter;
import com.bwie.week_02_demo.ibase.IBaseView;
import com.bwie.week_02_demo.model.bean.Beans;
import com.bwie.week_02_demo.model.bean.bean;
import com.bwie.week_02_demo.model.utils.HttpUtils;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class AccountModel implements AccountConter.Model {
    @Override
    public void ShowData( final MvpCallBack callBack) {

         Observable<Beans> getdata = HttpUtils.getInstance().api.getdata();

        getdata.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Beans>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Beans beans) {
                        List<Beans.BooksBean> list = beans.getBooks();
                        callBack.onSuccess(list);
                    }

                    @Override
                    public void onError(Throwable e) {

                        String s = e.toString();

                        Log.i("aaa",s+"");
                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

}
