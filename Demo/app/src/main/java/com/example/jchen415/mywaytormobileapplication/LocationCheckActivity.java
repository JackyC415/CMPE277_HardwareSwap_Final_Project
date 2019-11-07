package com.example.jchen415.mywaytormobileapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.jchen415.mywaytormobileapplication.LocationActivity.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION;


public class LocationCheckActivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback{
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_check);
        TextView CheckText = findViewById(R.id.CheckText);
        //check();
        Button bCheck = findViewById(R.id.bCheck);
        bCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                check();
            }
        });
    }
    public void check(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(getApplicationContext(), "Location Permissions Required!", Toast.LENGTH_SHORT).show();
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }
        else {
            startActivity(new Intent(LocationCheckActivity.this, LocationActivity.class));
        }
    }
}

