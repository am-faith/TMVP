package com.path2wind.tmvp.errorhandler;

import android.content.Context;

import com.path2wind.tmvp.errorhandler.listener.ResponseErroListener;

/**
 * @author Terry
 * @time 16/9/20 20:01
 * email path2wind@gmail.com
 */
public class ErrorHandlerFactory {

    public final String TAG = this.getClass().getSimpleName();
    private Context mContext;
    private ResponseErroListener mResponseErroListener;

    public ErrorHandlerFactory(Context mContext, ResponseErroListener mResponseErroListener) {
        this.mResponseErroListener = mResponseErroListener;
        this.mContext = mContext;
    }

    /**
     *  处理错误
     * @param throwable
     */
    public void handleError(Throwable throwable) {
        mResponseErroListener.handleResponseError(mContext, (Exception) throwable);
    }
}
