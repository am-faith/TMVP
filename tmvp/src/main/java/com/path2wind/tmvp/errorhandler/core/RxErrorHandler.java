package com.path2wind.tmvp.errorhandler.core;

import android.content.Context;

import com.path2wind.tmvp.errorhandler.ErrorHandlerFactory;
import com.path2wind.tmvp.errorhandler.listener.ResponseErroListener;

/**
 * @author Terry
 * @time 16/9/20 20:00
 * email path2wind@gmail.com
 */
public class RxErrorHandler {

    public final String TAG = this.getClass().getSimpleName();
    private ErrorHandlerFactory mHandlerFactory;

    private RxErrorHandler(Builder builder) {
        this.mHandlerFactory = builder.errorHandlerFactory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public ErrorHandlerFactory getmHandlerFactory() {
        return mHandlerFactory;
    }

    public static final class Builder {
        private Context context;
        private ResponseErroListener responseErroListener;
        private ErrorHandlerFactory errorHandlerFactory;

        private Builder() {
        }

        public Builder with(Context context) {
            this.context = context;
            return this;
        }

        public Builder responseErroListener(ResponseErroListener responseErroListener) {
            this.responseErroListener = responseErroListener;
            return this;
        }

        public RxErrorHandler build() {
            if (context == null)
                throw new IllegalStateException("context is required");

            if (responseErroListener == null)
                throw new IllegalStateException("responseErroListener is required");

            this.errorHandlerFactory = new ErrorHandlerFactory(context, responseErroListener);

            return new RxErrorHandler(this);
        }
    }


}
