package com.path2wind.tmvp.mvp;

import com.path2wind.tmvp.http.BaseCacheManager;
import com.path2wind.tmvp.http.BaseServiceManager;

/**
 * @author Terry
 * @time 16/9/19 20:36
 * email path2wind@gmail.com
 */
public class BaseModel<S extends BaseServiceManager, C extends BaseCacheManager> {

    protected S mServiceManager;
    protected C mCacheManager;


    public BaseModel(S mServiceManager, C mCacheManager) {
        this.mServiceManager = mServiceManager;
        this.mCacheManager = mCacheManager;
    }


    public void onDestory(){
        mServiceManager = null;
        mCacheManager  = null;
    }

}
