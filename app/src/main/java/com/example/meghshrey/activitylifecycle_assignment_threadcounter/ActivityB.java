package com.example.meghshrey.activitylifecycle_assignment_threadcounter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityB extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
    }
    public void finishActivityB(View view){
        ActivityB.this.finish();
    }
}