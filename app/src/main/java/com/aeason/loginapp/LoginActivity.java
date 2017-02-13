package com.aeason.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageButton;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView username;
    private TextView password;
    private AppCompatImageButton login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        username = (TextView) findViewById(R.id.username);
        password = (TextView) findViewById(R.id.password);
        login = (AppCompatImageButton) findViewById(R.id.loginButton);

        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.equals(login)) {
            if (username.getText().toString().toLowerCase().equals("andrew") && password.getText().toString().toLowerCase().equals("pass")) {
                Toast.makeText(getApplicationContext(), "Logged in!", Toast.LENGTH_LONG).show();

                Intent mainActivity = new Intent(this, MainActivity.class);
                this.startActivity(mainActivity);
                finish();
            }
            else {
                Toast.makeText(getApplicationContext(), "Incorrect Username or Password", Toast.LENGTH_LONG).show();
            }
        }
    }
}
