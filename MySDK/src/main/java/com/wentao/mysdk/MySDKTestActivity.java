package com.wentao.mysdk;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MySDKTestActivity extends AppCompatActivity {

    private static final String TAG = "MySDKTestActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sdktest);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(view -> Log.i(TAG, "You clicked module button!!"));
    }
}