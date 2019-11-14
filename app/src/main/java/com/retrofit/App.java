package com.retrofit;

import android.app.Application;
import android.content.SharedPreferences;

import com.retrofit.data.SharedPreferenceHelper;

public class App  extends Application {

    private  static SharedPreferenceHelper preferenceHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        preferenceHelper = new SharedPreferenceHelper( this);
    }

    public static SharedPreferenceHelper getPreference(){
        return preferenceHelper;
    }
}
