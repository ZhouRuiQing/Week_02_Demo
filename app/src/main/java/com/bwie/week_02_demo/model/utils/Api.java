package com.bwie.week_02_demo.model.utils;

import com.bwie.week_02_demo.model.bean.Beans;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {

    @GET("v2/book/search?q=1")
    Observable<Beans> getdata();
}
