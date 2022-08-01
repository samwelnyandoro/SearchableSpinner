package com.searchablespinner.searchablespinner;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by samwel nyandoro on 01/08/2022.
 */

public class SearchableSpinnerApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
