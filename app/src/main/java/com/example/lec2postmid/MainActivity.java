package com.example.lec2postmid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("ALC 1", "onStart: ");
    }
    protected void onResume()
    {
        super.onResume();
        Log.d("ALC 1", "onResume: ");
    }
    protected void onPause()
    {
        super.onPause();
        Log.d("ALC 1", "onPause: ");
    }
    protected void onStop()
    {
        super.onStop();
        Log.d("ALC 1", "onStop: ");
    }
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("ALC 1", "onDestroy: ");
    }
}