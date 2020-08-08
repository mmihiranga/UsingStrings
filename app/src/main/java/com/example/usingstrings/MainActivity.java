package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;


import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 = findViewById(R.id.tvMsg2);
        txtMsg2.setText(R.string.Msg2);

        Log.i( "Lifecycle" , "OnCreate() Invoked");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("Lifecycle","On start called..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Lifecycle","On Resume called..");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Lifecycle","On Restart called..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Lifecycle","On Pause called..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Lifecycle","On Stop called..");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Lifecycle","On Destroy called..");
    }
}