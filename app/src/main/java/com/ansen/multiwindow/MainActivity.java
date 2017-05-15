package com.ansen.multiwindow;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        Log.i("MainActivity","onMultiWindowModeChanged isInMultiWindowMode:"+isInMultiWindowMode);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            Log.i("MainActivity","是否处于多窗口模式:"+isInMultiWindowMode());
        }
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }
}
