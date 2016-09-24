package com.path2wind.tmvp.di.module;

import android.app.Service;
import android.content.Context;

import com.path2wind.tmvp.di.ContextLife;
import com.path2wind.tmvp.di.PerService;

import dagger.Module;
import dagger.Provides;

/**
 * @author Terry
 * @time 16/9/24 19:49
 * email path2wind@gmail.com
 */
@Module
public class ServiceModule {
    private Service mService;

    public ServiceModule(Service service) {
        mService = service;
    }

    @Provides
    @PerService
    @ContextLife("Service")
    public Context provideContext() {
        return mService;
    }
}
