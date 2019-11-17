package com.rathana.acitivity_demo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

public class LoginActivity extends AppCompatActivity {

    private Button buttonExplicitIntent, buttonImplicitIntent;

    private AppCompatImageView buttonCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonExplicitIntent = findViewById(R.id.buttonLogin);
        buttonImplicitIntent= findViewById(R.id.buttonImplicit);
        buttonCall=findViewById(R.id.buttonCall);

        buttonExplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //explicit intent
                Intent intent = new Intent(
                        LoginActivity.this,
                        HomeActivity.class);
                startActivity(intent);

            }
        });

        buttonImplicitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code Implicit Intent
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com.kh"));
                startActivity(intent);
            }
        });

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //implicit intent dial phone
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:012812812"));
                startActivity(intent);
                String textMessage= "Hello";
            }
        });
    }
}
