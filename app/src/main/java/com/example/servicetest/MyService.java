package com.example.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    public DownloadBinder mBinder = new DownloadBinder();
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    class DownloadBinder extends Binder {

        public void startDownload() {
            Log.d("Myservice", "startDownload executed");
        }

        public int getProgress() {
            Log.d("Myservice", "getProgress executed");
            return 0;
        }
    }
}
