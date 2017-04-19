package com.google.firebase.quickstart.database;

import android.util.Log;

import com.facebook.FacebookSdk;
import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

public class DroidApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (!FirebaseApp.getApps(this).isEmpty()) {
            Log.d("FIREBASE", "Enabling persinstence!");
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        }
        Firebase.setAndroidContext(this);
        /* Initialize Facebook SDK*/
        FacebookSdk.sdkInitialize(getApplicationContext());


    }
}
