package com.example.activitylifecycletest;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "on_Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "on_Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "on_Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "on_Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "on_Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "on_Restart");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "Something you just typed";
        outState.putString("data_key",tempData);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        if(savedInstanceState!=null){
            String tempData = savedInstanceState.getString("data_key");
            Log.d(TAG,tempData);
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.stat_dialog_activity), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.stat_normal_activity), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button startnormalactivity=(Button) findViewById(R.id.stat_normal_activity);
        Button startdialogactivity=(Button) findViewById(R.id.stat_dialog_activity);

        startnormalactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Normal_Activity.class);
                startActivity(intent);
            }
        });
        startdialogactivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });


    }
}