package com.example.peter.findme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        // declare variables
        final EditText etUser = (EditText) findViewById(R.id.etUser);
        /*final EditText etPassword = (EditText) findViewById(R.id.etPassword);*/
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
    }
}
