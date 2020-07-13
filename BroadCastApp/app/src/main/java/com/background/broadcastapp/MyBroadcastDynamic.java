package com.background.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;
public class MyBroadcastDynamic extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //no manifest receiver nor permissions
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())) {
            boolean noConnectivity = intent.getBooleanExtra(
                    ConnectivityManager.EXTRA_NO_CONNECTIVITY, false
            );
            if (noConnectivity) {
                Toast.makeText(context, "Disconnected", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
