package com.example.hellowordnew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {
    EditText edtso1, edtso2;
    TextView ketQua;
    Button btnback, btnNextTextView, btnTong;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        btnback = (Button) findViewById(R.id.btnback);
        edtso1 = (EditText) findViewById(R.id.editText1);
        edtso2 = (EditText) findViewById(R.id.editText2);
        ketQua = (TextView) findViewById(R.id.ketQua);
        btnTong = (Button) findViewById(R.id.btnTong);
        btnNextTextView = (Button) findViewById(R.id.btnNextTextView);



        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi1 = edtso1.getText().toString();
                int so1 = Integer.parseInt(chuoi1);

                String chuoi2 = edtso2.getText().toString();
                int so2 = Integer.parseInt(chuoi2);

                int tong = so1 + so2;

             ketQua.setText(String.valueOf(tong));

            }
        });

        btnNextTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent  = new Intent(ChildActivity.this, com.example.hellowordnew.TextView.class);

//                int a = Integer.parseInt(edtso1.getText().toString());
//                int b = Integer.parseInt(edtso2.getText().toString());
//
//                Bundle myBundle = new Bundle();
//
//                myBundle.putInt("soA",a);
//                myBundle.putInt("soB",b);
//
//                myintent.putExtra("mypackage", myBundle);

                startActivity(myintent);

            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });


    }
}