package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sgininPage extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginin_page);


        button =(Button) findViewById(R.id.sginin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openhotelReservation();


            }
        });


    }
    public void openhotelReservation()
    {
        Intent intent = new Intent(this, hotelReservation.class);
        startActivity(intent);
    }
}

