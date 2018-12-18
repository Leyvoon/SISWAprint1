package com.merg.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Payment extends AppCompatActivity {

    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Button btn6 = (Button)findViewById(R.id.btnSubmit);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(Payment.this, Order.class);
                startActivity(int6);
            }
        });}

        public void checkButton(View v){
        radioButton = findViewById(R.id.radioButton);
        radioButton = findViewById(R.id.radioButton2);

    }
}
