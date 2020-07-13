package com.background.broadcastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    //for dynamic broadcasts
    MyBroadcastDynamic myBroadcastDynamic = new MyBroadcastDynamic();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //for dynamic broadcasts
        //specify the action to listen for
        //can be more than one actions
        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(myBroadcastDynamic, filter);
    }
    @Override
    protected void onStop() {
        super.onStop();
        //background
        //for dynamic broadcasts
        unregisterReceiver(myBroadcastDynamic);
    }

    //if you want to run it in the background register in onCreate and unregister in onDestroy
}