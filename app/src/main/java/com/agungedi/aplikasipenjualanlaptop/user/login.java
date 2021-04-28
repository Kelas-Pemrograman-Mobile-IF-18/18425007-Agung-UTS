package com.agungedi.aplikasipenjualanlaptop.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.agungedi.aplikasipenjualanlaptop.R;
import com.agungedi.aplikasipenjualanlaptop.admin.homeadmin;
import com.ornach.nobobutton.NoboButton;

public class login extends AppCompatActivity {

    Button btnRegistrasi;
    NoboButton btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnRegistrasi = (Button) findViewById(R.id.Register);
        btnLogin = (NoboButton) findViewById(R.id.btLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this, homeadmin.class);
                startActivity(i);
                finish();
            }
        });

        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(login.this, regis.class);
                startActivity(i);
                finish();
            }
        });
    }
}