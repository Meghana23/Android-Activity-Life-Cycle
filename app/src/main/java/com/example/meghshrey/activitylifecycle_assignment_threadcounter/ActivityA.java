package com.example.meghshrey.activitylifecycle_assignment_threadcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {

      int counter = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        TextView textView = (TextView)findViewById(R.id.editText_value);
        Button btn_close = (Button) findViewById(R.id.btn_closeapp);

    }

    public void onClickButtonCloseApp(View v) {
        this.finish();
    }

    public void startActivity_B(View v) {
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        startActivity(intent);
    }
    public void startDialog(View v) {
        Intent intent = new Intent(ActivityA.this, DialogActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onResume() {
        super.onResume();
        counter++;
        TextView textView = (TextView)findViewById(R.id.editText_value);
        textView.setText(Integer.toString(counter));

    }

    @Override
    protected void onPause() {
        super.onPause();
        counter++;
        TextView textView = (TextView)findViewById(R.id.editText_value);
        textView.setText(Integer.toString(counter));


    }
}
