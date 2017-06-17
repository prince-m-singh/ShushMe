package com.example.android.shushme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by princ on 17-06-2017.
 */

public class GeofenceBroadcastReceiver extends BroadcastReceiver {
    // TODO (4) Create a GeofenceBroadcastReceiver class that extends BroadcastReceiver and override
    // onReceive() to simply log a message when called. Don't forget to add a receiver tag in the Manifest

    public static final String TAG = GeofenceBroadcastReceiver.class.getSimpleName();

    /***
     * Handles the Broadcast message sent when the Geofence Transition is triggered
     * Careful here though, this is running on the main thread so make sure you start an AsyncTask for
     * anything that takes longer than say 10 second to run
     *
     * @param context
     * @param intent
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive called");
    }
}
