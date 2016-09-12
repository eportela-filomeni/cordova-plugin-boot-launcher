package fr.edps.cordova.bootlauncher;

import android.content.Intent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.app.Service;
import android.os.Binder;

public class BootLauncher extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        startService(new Intent( MainActivity.this,BackgroundService.class));
        
        //Intent serviceIntent = new Intent(context, demo.mobile.ionic.MainActivity.class);
        //serviceIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //context.startActivity(serviceIntent);
    }
}
