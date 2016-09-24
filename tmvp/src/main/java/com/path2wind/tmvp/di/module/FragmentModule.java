package com.path2wind.tmvp.di.module;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

import com.path2wind.tmvp.di.ContextLife;
import com.path2wind.tmvp.di.PerFragment;

import dagger.Module;
import dagger.Provides;

/**
 * @author Terry
 * @time 16/9/24 19:48
 * email path2wind@gmail.com
 */
@Module
public class FragmentModule {

    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        mFragment = fragment;
    }

    @Provides
    @PerFragment
    @ContextLife("Activity")
    public Context provideContext() {
        return mFragment.getActivity();
    }

    @Provides
    @PerFragment
    public Activity provideActivity() {
        return mFragment.getActivity();
    }

    @Provides
    @PerFragment
    public Fragment provideFragment() {
        return mFragment;
    }
}
