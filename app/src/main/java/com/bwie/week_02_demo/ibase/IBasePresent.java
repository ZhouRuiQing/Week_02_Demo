package com.bwie.week_02_demo.ibase;

public interface IBasePresent<V extends IBaseView> {


    void attchView(V v);
    void deattchView();
}
