package com.example.pushnotifications;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseMessegingService extends FirebaseMessagingService {
    private static final String TAG = MyFirebaseMessegingService.class.getSimpleName();
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d(TAG,"Token: "+token);

        //upload the token to your server
        // you have to store in prefereces
    }
}
