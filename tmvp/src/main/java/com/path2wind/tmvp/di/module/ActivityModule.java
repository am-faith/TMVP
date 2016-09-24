package com.path2wind.tmvp.di.module;

import android.app.Activity;
import android.content.Context;

import com.path2wind.tmvp.di.ContextLife;
import com.path2wind.tmvp.di.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @author Terry
 * @time 16/9/24 19:47
 * email path2wind@gmail.com
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @PerActivity
    @ContextLife("Activity")
    public Context provideContext() {
        return mActivity;
    }

    @Provides
    @PerActivity
    public Activity provideActivity() {
        return mActivity;
    }


}
