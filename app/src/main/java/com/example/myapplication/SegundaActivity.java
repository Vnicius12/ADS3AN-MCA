package com.example.myapplication;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SegundaActivity extends AppCompatActivity {

    private static final String TAG = "ciclodevida";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Log.i(ContentValues.TAG, "SegundaActivity.onCreate");

    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(ContentValues.TAG, "SegundaActivity.onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(ContentValues.TAG,"SegundaActivity.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(ContentValues.TAG,"SegundaActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(ContentValues.TAG,"SegundaActivity.onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(ContentValues.TAG,"SegundaActivity.onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(ContentValues.TAG,"SegundaActivity.onDestroy");
    }
}
