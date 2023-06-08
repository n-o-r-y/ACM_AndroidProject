package com.example.acm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Beginner extends AppCompatActivity {
    TextView green,bee;
    Button pre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);
        bee=findViewById(R.id.beeCrID);
        green=findViewById(R.id.GreenID);

        bee.setMovementMethod(LinkMovementMethod.getInstance());
        green.setMovementMethod(LinkMovementMethod.getInstance());

        pre=findViewById(R.id.previousID);
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Beginner.this,Home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}