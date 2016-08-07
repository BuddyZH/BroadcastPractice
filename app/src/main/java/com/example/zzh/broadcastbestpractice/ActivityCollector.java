package com.example.zzh.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZZH on 2016/8/7.
 */
public class ActivityCollector {

    private static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity){ activities.add(activity); }

    public static void removeActivity(Activity activity) { activities.remove(activity); }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
