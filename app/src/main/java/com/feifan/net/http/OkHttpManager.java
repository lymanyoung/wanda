package com.feifan.net.http;

import android.os.Handler;
import android.os.Looper;

import java.net.CookieManager;
import java.net.CookiePolicy;

import okhttp3.OkHttpClient;

/**
 *
 * @author lgy
 * @date 2016年4月7日13:55:04
 */
public class OkHttpManager {

    private static OkHttpManager mInstance;
    private static OkHttpClient mHttpClient;
    private Handler mDelivery;

    public OkHttpManager() {
        mHttpClient = new OkHttpClient();
        mDelivery = new Handler(Looper.getMainLooper());
    }

    public static OkHttpManager getInstance(){
        if (mInstance == null)
        {
            synchronized (OkHttpManager.class)
            {
                if (mInstance == null)
                {
                    mInstance = new OkHttpManager();
                }
            }
        }
        return mInstance;
    }
}
