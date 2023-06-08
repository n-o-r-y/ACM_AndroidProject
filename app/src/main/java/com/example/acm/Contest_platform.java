package com.example.acm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Contest_platform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contest_platform);
        ImageButton cf=findViewById(R.id.codeforcesButton);
        ImageButton at=findViewById(R.id.atcoderButton);
        ImageButton cc=findViewById(R.id.codechefButton);
        ImageButton hr=findViewById(R.id.hackerrankButton);
        ImageButton vj=findViewById(R.id.vjudgeButton);
        ImageButton to=findViewById(R.id.tophButton);
        cf.setOnClickListener(v -> gotoLink("https://codeforces.com/"));
        at.setOnClickListener(v -> gotoLink("https://atcoder.jp/"));
        cc.setOnClickListener(v -> gotoLink("https://www.codechef.com/"));
        hr.setOnClickListener(v -> gotoLink("https://www.hackerrank.com/"));
        vj.setOnClickListener(v -> gotoLink("https://vjudge.net/"));
        to.setOnClickListener(v -> gotoLink("https://toph.co/"));
    }
    private void gotoLink(String url){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}