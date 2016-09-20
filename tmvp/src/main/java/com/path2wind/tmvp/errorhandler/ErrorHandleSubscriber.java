package com.path2wind.tmvp.errorhandler;

import com.path2wind.tmvp.errorhandler.core.RxErrorHandler;

import rx.Subscriber;

/**
 * @author Terry
 * @time 16/9/20 20:01
 * email path2wind@gmail.com
 */
public abstract class ErrorHandleSubscriber<T> extends Subscriber<T> {

    private ErrorHandlerFactory mHandlerFactory;

    public ErrorHandleSubscriber(RxErrorHandler rxErrorHandler){
        this.mHandlerFactory = rxErrorHandler.getmHandlerFactory();
    }

    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        mHandlerFactory.handleError(e);
    }
}
