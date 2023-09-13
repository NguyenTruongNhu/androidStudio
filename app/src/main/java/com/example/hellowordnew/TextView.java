package com.example.hellowordnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TextView extends AppCompatActivity {
    android.widget.TextView ketQuaTextView;

    Button btnBackTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        btnBackTextView = (Button) findViewById(R.id.btnBackTextView);
//        ketQuaTextView = (android.widget.TextView) findViewById(R.id.ketQuaTextView);
//
//        Intent myintent = getIntent();
//
//        Bundle myBundle = myintent.getBundleExtra("mypackage");
//
//        int a = myBundle.getInt("soA");
//        int b = myBundle.getInt("soB");
//
//        int tong = a + b;
//        ketQuaTextView.setText(tong);


        btnBackTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}