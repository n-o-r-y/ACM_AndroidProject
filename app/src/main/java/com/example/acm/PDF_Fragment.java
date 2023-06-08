package com.example.acm;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class PDF_Fragment extends Fragment {
    TextView pdf;
    Button btn;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_p_d_f_, container, false);
        pdf=view.findViewById(R.id.pdfID);
        btn=view.findViewById(R.id.previousID);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getContext(),Resources.class);
                startActivity(intent);
            }
        });
        return view;
    }
}