package com.bwie.week_02_demo.ibase;


import com.bwie.week_02_demo.model.bean.Beans;

import java.util.List;

/**
 * MVP契约类
 */
public interface AccountConter {

        interface View extends IBaseView{

            void Showing(List<Beans.BooksBean> reluct);
            void hideing();
            void onError();
        }

        interface Model extends IBaseModel{

            interface MvpCallBack{

                void onSuccess(List<Beans.BooksBean> list);
                void onError(String msg);
            }
            void ShowData(MvpCallBack callBack);
        }



        interface Present extends IBasePresent<View>{

            void ShowData();
        }

}
