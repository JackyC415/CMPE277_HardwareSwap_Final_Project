package com.cmpe277project.hardwareswap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {

    private static FirebaseAuth firebaseAuth;
    private DatabaseReference itemsReference;
    private ArrayList<Item> listItems;
    private DataSnapshot dataSnapshot;

    private ImageView addItemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        addItemButton = findViewById(R.id.addItemButton);
        addItemButton.setClickable(true);


        // Set onClickListener
        final View.OnClickListener buttonClick = new View.OnClickListener(){
            public void onClick(View view){
                final int id = view.getId();

                if(id == R.id.addItemButton){
                    startAddItemActivity();

                }

            }
        };

        addItemButton.setOnClickListener(buttonClick) ;

    }

    public void startAddItemActivity(){
        Intent addItemIntent = new Intent(HomePageActivity.this, AddItemActivity.class);
        startActivity(addItemIntent);
    }

}
