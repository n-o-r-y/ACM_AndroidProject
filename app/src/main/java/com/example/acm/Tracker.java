package com.example.acm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tracker extends AppCompatActivity {

    TextView tracker;
    Button pre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_tracker);
        tracker=findViewById(R.id.TrackerSheetID);

        tracker.setMovementMethod(LinkMovementMethod.getInstance());
        pre=findViewById(R.id.previousID);
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Tracker.this,Home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}