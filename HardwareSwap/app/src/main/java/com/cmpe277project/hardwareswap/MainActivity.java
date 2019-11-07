package com.cmpe277project.hardwareswap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button loginButton = findViewById(R.id.loginButton);
        final Button registerButton = findViewById(R.id.registerButton);
        final TextView phoneNumber = findViewById(R.id.phoneNumber);
        final TextView password = findViewById(R.id.password);

        // Set onClickListener
        final View.OnClickListener buttonClick = new View.OnClickListener(){
            public void onClick(View view){
                final int id = view.getId();

                if(id == R.id.loginButton){
                    System.out.println("Login Button Clicked");

                }
                else if (id == R.id.registerButton){
                    System.out.println("Register Button Clicked");
                }
            }
        };

        // Set button click
        loginButton.setOnClickListener(buttonClick);
        registerButton.setOnClickListener(buttonClick);

    }




}
