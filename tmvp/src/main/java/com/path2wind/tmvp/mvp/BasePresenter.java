package com.path2wind.tmvp.mvp;

import android.app.Activity;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * @author Terry
 * @time 16/9/19 20:46
 * email path2wind@gmail.com
 */
public class BasePresenter<T extends IView> implements IPresenter<T> {

    protected Activity mActivity;
    protected T mView;
    private CompositeSubscription mCompositeSubscription;


    @Override
    public void attachView(T iView) {
        this.mView = iView;
    }


    @Override
    public void detachView() {
        this.mView = null;
        unSubscribe();
    }


    protected void unSubscribe() {
        if (mCompositeSubscription != null) {
            mCompositeSubscription.unsubscribe();
        }
    }


    protected void addSubscribe(Subscription subscription) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscription);
    }


}
