package com.background.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;
public class MyBroadcastReceiver extends BroadcastReceiver {
    //Code execution in the future even if the app is closed
    //this is an implicit broadcast receiver as it is not called by classname
    //putting broadcast receiver in the manifest file we register it statically

    @Override
    public void onReceive(Context context, Intent intent) {
        //intent is the action ;
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Toast.makeText(context, "Boot completed", Toast.LENGTH_SHORT).show();
        }
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            Toast.makeText(context, "Connectivity changed", Toast.LENGTH_SHORT).show();
        }
    }
}
