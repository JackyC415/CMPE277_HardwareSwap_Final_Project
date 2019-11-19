package com.cmpe277project.hardwareswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button loginButton = findViewById(R.id.buttonSignIn);
        final Button registerButton = findViewById(R.id.buttonRegister);
        final Button resetButton = findViewById(R.id.buttonReset);
        final TextView phoneNumber = findViewById(R.id.phoneNumber);
        final TextView password = findViewById(R.id.password);

        // Set onClickListener
        final View.OnClickListener buttonClick = new View.OnClickListener(){
            public void onClick(View view){
                final int id = view.getId();

                if(id == R.id.buttonSignIn){
                    System.out.println("Login Button Clicked");
                    startHomePageActivity();

                }
                else if (id == R.id.buttonRegister){
                    System.out.println("Register Button Clicked");
                    startRegisterActivity();
                }
                else if (id == R.id.buttonReset){
                    System.out.println("Reset Button Clicked");
                }
            }
        };

        // Set button click
        loginButton.setOnClickListener(buttonClick);
        registerButton.setOnClickListener(buttonClick);
        resetButton.setOnClickListener(buttonClick);
    }


    public void startHomePageActivity(){
        Intent homepageIntent = new Intent(MainActivity.this, HomePageActivity.class);
        startActivity(homepageIntent);

    }

    public void startRegisterActivity(){
        Intent registerIntent = new Intent (MainActivity.this, RegisterActivity.class);
        startActivity(registerIntent);
    }

}
