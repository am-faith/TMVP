package com.path2wind.tmvp.mvp;

/**
 * @author Terry
 * @time 16/9/19 20:44
 * email path2wind@gmail.com
 */
public interface IView {

    void showLoading(String msg);

    void showLoading();

    void hideLoading();

    void showMessage(String msg);

}
