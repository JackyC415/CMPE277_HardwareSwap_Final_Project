package com.example.jchen415.mywaytormobileapplication;

import android.database.Cursor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class orderSummary extends AppCompatActivity {

    //create objects
    DBController db;
    TextView orders;
    Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_summary);

        db = new DBController(this);
        orders = (TextView) findViewById(R.id.name_O);
        go = (Button) findViewById(R.id.Pay);

        if(db.checkSummary1() == true) {
            Cursor res = db.getAllData();
            StringBuffer buff = new StringBuffer();
            StringBuffer buff1 = new StringBuffer();
            StringBuffer buff2 = new StringBuffer();

            do {
                buff.append("Name: " + res.getString(0) + " X " + res.getString(2) + "     Price: " + res.getString(1) + "\n");
            } while (res.moveToNext());

            orders.setText(buff);
            goTo();
        }
        else {
            Toast.makeText(getApplicationContext(), "Cart Empty!", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void goTo() {
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(orderSummary.this, Payment.class));
                finish();
            }
        });
    }
}