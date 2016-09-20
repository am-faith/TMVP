package com.path2wind.tmvp.errorhandler.listener;

import android.content.Context;

/**
 * @author Terry
 * @time 16/9/20 20:02
 * email path2wind@gmail.com
 */
public interface ResponseErroListener {
    void handleResponseError(Context context, Exception e);
}
