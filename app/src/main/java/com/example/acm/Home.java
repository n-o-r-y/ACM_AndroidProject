package com.example.acm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {
    Button beginnerCard,blueSheetCard,resourcesCard,trackerCard,contestCard,rulesCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        beginnerCard=findViewById(R.id.BeginnerID);
        blueSheetCard=findViewById(R.id.BlueID);
        resourcesCard=findViewById(R.id.ResourcesID);
        trackerCard=findViewById(R.id.trackerID);
        contestCard=findViewById(R.id.contestID);
        rulesCard=findViewById(R.id.rulesID);

        beginnerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Beginner.class);
                startActivity(intent);
                finish();
            }
        });
        blueSheetCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Blue.class);
                startActivity(intent);
                finish();
            }
        });
        resourcesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Resources.class);
                startActivity(intent);
                finish();
            }
        });
        trackerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Tracker.class);
                startActivity(intent);
                finish();
            }
        });
        contestCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Contest_platform.class);
                startActivity(intent);
                finish();
            }
        });
        rulesCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Home.this,Rules.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
