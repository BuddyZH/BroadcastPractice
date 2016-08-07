package com.example.zzh.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by ZZH on 2016/8/7.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
