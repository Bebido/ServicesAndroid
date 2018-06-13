package com.example.mariusz.serwis;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.example.mariusz.common.IMyAidlInterface;

public class MyService extends Service {

    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }

    private final IMyAidlInterface.Stub binder = new IMyAidlInterface.Stub() {

        @Override
        public float mnozenie(float[] a) throws RemoteException {
            return a[0]*a[1];
        }
    };
}
