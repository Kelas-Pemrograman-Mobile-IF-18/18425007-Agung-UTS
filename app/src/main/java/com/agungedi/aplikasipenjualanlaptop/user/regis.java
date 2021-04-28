package com.agungedi.aplikasipenjualanlaptop.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.agungedi.aplikasipenjualanlaptop.R;

public class regis extends AppCompatActivity {

    Button btnKembaliLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        getSupportActionBar().hide();

        btnKembaliLogin = (Button) findViewById(R.id.kembaliLogin);

        btnKembaliLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(regis.this, login.class);
                startActivity(i);
                finish();
            }
        });
    }
}