package com.merg.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button btn1 = (Button)findViewById(R.id.btnAbout);
        Button btn2 = (Button)findViewById(R.id.btnServices);
        Button btn3 = (Button)findViewById(R.id.btnPayment);
        Button btn4 = (Button)findViewById(R.id.btnContact);
        Button btn5 = (Button)findViewById(R.id.btnQr);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(SecondActivity.this, AboutUs.class);
                startActivity(int1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(SecondActivity.this, Services.class);
                startActivity(int2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(SecondActivity.this, Payment.class);
                startActivity(int3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(SecondActivity.this, Contact.class);
                startActivity(int4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(SecondActivity.this, QR.class);
                startActivity(int5);
            }
        });
    }
}
