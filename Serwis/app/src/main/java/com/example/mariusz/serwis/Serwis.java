package com.example.mariusz.serwis;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Serwis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serwis);
        Intent intent = new Intent(this, MyService.class);
        startService(intent);
    }
}
