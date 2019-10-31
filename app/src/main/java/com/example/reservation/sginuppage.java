package com.example.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sginuppage extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sginuppage);

        button =(Button) findViewById(R.id.sginup);
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



