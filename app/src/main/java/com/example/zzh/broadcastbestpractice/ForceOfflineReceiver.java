package com.example.zzh.broadcastbestpractice;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.WindowManager;

/**
 * Created by ZZH on 2016/8/7.
 */
public class ForceOfflineReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(context);
        dialogBuilder.setTitle("Waring");
        dialogBuilder
                .setMessage("You are forced to be offline. Please try to login again.");
        dialogBuilder.setCancelable(false);
        dialogBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ActivityCollector.finishAll();
                        Intent intent = new Intent(context, LoginActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);

                    }
                });
        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.getWindow().setType(
                WindowManager.LayoutParams.TYPE_SYSTEM_ALERT
        );
        alertDialog.show();
    }
}
