package com.cmpe277project.hardwareswap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class AddItemActivity extends AppCompatActivity {


    private EditText itemNameEditText;
    private Button submitButton;
    private FirebaseFirestore database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        itemNameEditText = findViewById(R.id.itemName);
        submitButton = findViewById(R.id.submitButton);

        // Set onClickListener
        final View.OnClickListener buttonClick = new View.OnClickListener(){
            public void onClick(View view){
                final int id = view.getId();

                if(id == R.id.submitButton){
                    System.out.println("Submit clicked");
                    submitItem();
                }

            }
        };

        submitButton.setOnClickListener(buttonClick) ;

    }

    public void submitItem(){

        Map<String, Object> data = new HashMap<>();
        data.put("name", "Tokyo");
        data.put("country", "Japan");

        database.collection("items")
                .add(data)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        System.out.println("SUCCESS");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        System.out.println("FAILED");
                    }
                });;
        String itemName = itemNameEditText.getText().toString().trim();

        Item test = new Item();

        test.setItemName(itemName);
        test.setItemBuyers(null);


    }


}
