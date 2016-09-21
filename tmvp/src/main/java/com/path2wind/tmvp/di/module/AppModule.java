package com.path2wind.tmvp.di.module;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.path2wind.tmvp.di.ContextLife;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Terry
 * @time 16/9/21 20:36
 * email path2wind@gmail.com
 */

@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application application) {
        this.mApplication = application;
    }

    @Singleton
    @Provides
    public Application provideApplication() {
        return mApplication;
    }

    @Provides
    @Singleton
    @ContextLife("Application")
    public Context provideContext(){
        return mApplication.getApplicationContext();
    }

    @Provides
    @Singleton
    public Resources provideResources(){
        return mApplication.getResources();
    }

}
