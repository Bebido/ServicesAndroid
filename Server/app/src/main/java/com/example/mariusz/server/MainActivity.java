package com.example.mariusz.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MainActivity extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        //return null;
        return binder;
    }

    private final IMyAidlInterface.Stub binder = new IMyAidlInterface.Stub() {
        @Override
        public float mnozenie(float a, float b) throws RemoteException {
            return a * b;
        }
    };
}
