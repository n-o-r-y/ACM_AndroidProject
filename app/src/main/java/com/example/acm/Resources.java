package com.example.acm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resources extends AppCompatActivity {

    Button fstbtn, secbtn,pre;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);

        fstbtn = findViewById(R.id.btnVideo);
        secbtn = findViewById(R.id.btnPDF);

        pre=findViewById(R.id.previousID);
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Resources.this,Home.class);
                startActivity(intent);
                finish();
            }
        });
        fstbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replace(new Videos_Fragment());
            }
        });

        secbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replace(new PDF_Fragment());
            }
        });
    }

    private void replace(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameLat, fragment);
        ft.commit();
    }
}
