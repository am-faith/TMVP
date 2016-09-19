package com.path2wind.tmvp.mvp;

/**
 * @author Terry
 * @time 16/9/19 20:38
 * email path2wind@gmail.com
 */
public interface IPresenter<T extends IView> {

    void attachView(T iView);

    void detachView();

}
